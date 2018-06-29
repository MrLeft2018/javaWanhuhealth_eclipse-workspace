package com.crm.publics;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import com.crm.page.LoginPage;
//import com.crm.page.OrderPage;

//������ַ���
public class LoginUser {

	//��¼�Լ���¼ҳ����ʾ������
	public static void login(WebDriver driver,String username,String password){
	LoginPage.login_UserName(driver).clear();
	LoginPage.login_UserName(driver).sendKeys(username);
	LoginPage.login_Password(driver).clear();
	LoginPage.login_Password(driver).sendKeys(password);
	LoginPage.login_Button(driver).click();
	}
	
	//��¼�Լ���¼ҳ�浯����ʾ������
	public static void login1(WebDriver driver,String username,String password) throws InterruptedException{
		LoginPage.login_UserName(driver).clear();
		LoginPage.login_UserName(driver).sendKeys(username);
		Thread.sleep(1000);
		LoginPage.login_Password(driver).clear();
		LoginPage.login_Password(driver).sendKeys(password);
		LoginPage.login_Button(driver).click();
		//���������ʾ�е�ȷ��
		LoginPage.login_Error_Button(driver).click();
		}
	
	//��¼�û�
	/*public static String login_user_info(WebDriver driver){
	String text = LoginPage.login_User(driver).getText();
	return text;
	}*/
	
	//�˳�����
	public static void logout(WebDriver driver) throws InterruptedException{
		// ʵ��������¼�����action
	    Actions action = new Actions(driver);    
	   // �����ͣ��ִ�д洢��Ϊ.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[6]/span"))).perform();
	   // ����˳���ť
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[2]/div/div/div/div[1]/div[2]")).click();
	    //driver.findElement(By.cssSelector(".ant-col-18")).click();		
		driver.quit();
	}	
	
	
	
	
}

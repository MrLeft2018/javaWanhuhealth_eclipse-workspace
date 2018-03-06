package com.crm.publics;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import com.crm.page.LoginPage;
import com.crm.page.OrderPage;

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
	public static void login1(WebDriver driver,String username,String password){
		LoginPage.login_UserName(driver).clear();
		LoginPage.login_UserName(driver).sendKeys(username);
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
	public static void logout(WebDriver driver){
		// ʵ��������¼�����action
	    Actions action = new Actions(driver);    
	   // �����ͣ��ִ�д洢��Ϊ.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span"))).perform();
	  //  ����˳���ť
	    driver.findElement(By.cssSelector(".ant-col-18")).click();		
		driver.quit();
	}	
	
	//��ȡ��¼������ʾ������test1
	public static String login_error_info1(WebDriver driver){
	String text1 = LoginPage.login_Error_Hint1(driver).getText();
	return text1;
	}
	//��ȡ��¼������ʾ������test2
	public static String login_error_info2(WebDriver driver){
	String text2 = LoginPage.login_Error_Hint2(driver).getText();
	return text2;
	}
	
	
}

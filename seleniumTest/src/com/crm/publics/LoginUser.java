package com.crm.publics;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import com.crm.page.LoginPage;
import com.crm.page.OrderPage;

//定义各种方法
public class LoginUser {

	//登录以及登录页面提示处理方法
	public static void login(WebDriver driver,String username,String password){
	LoginPage.login_UserName(driver).clear();
	LoginPage.login_UserName(driver).sendKeys(username);
	LoginPage.login_Password(driver).clear();
	LoginPage.login_Password(driver).sendKeys(password);
	LoginPage.login_Button(driver).click();
	}
	
	//登录以及登录页面弹窗提示处理方法
	public static void login1(WebDriver driver,String username,String password){
		LoginPage.login_UserName(driver).clear();
		LoginPage.login_UserName(driver).sendKeys(username);
		LoginPage.login_Password(driver).clear();
		LoginPage.login_Password(driver).sendKeys(password);
		LoginPage.login_Button(driver).click();
		//点击弹窗提示中的确定
		LoginPage.login_Error_Button(driver).click();
		}
	
	//登录用户
	/*public static String login_user_info(WebDriver driver){
	String text = LoginPage.login_User(driver).getText();
	return text;
	}*/
	
	//退出方法
	public static void logout(WebDriver driver){
		// 实例化鼠标事件对象action
	    Actions action = new Actions(driver);    
	   // 鼠标悬停并执行存储行为.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span"))).perform();
	  //  点击退出按钮
	    driver.findElement(By.cssSelector(".ant-col-18")).click();		
		driver.quit();
	}	
	
	//获取登录错误提示，返回test1
	public static String login_error_info1(WebDriver driver){
	String text1 = LoginPage.login_Error_Hint1(driver).getText();
	return text1;
	}
	//获取登录错误提示，返回test2
	public static String login_error_info2(WebDriver driver){
	String text2 = LoginPage.login_Error_Hint2(driver).getText();
	return text2;
	}
	
	
}

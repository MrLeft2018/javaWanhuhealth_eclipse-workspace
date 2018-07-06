package com.crm.publics;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import com.crm.page.LoginPage;
//import com.crm.page.OrderPage;

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
	public static void login1(WebDriver driver,String username,String password) throws InterruptedException{
		LoginPage.login_UserName(driver).clear();
		LoginPage.login_UserName(driver).sendKeys(username);
		Thread.sleep(1000);
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
	public static void logout(WebDriver driver) throws InterruptedException{
		// 实例化鼠标事件对象action
	    Actions action = new Actions(driver);    
	   // 鼠标悬停并执行存储行为.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[6]/span"))).perform();
	   // 点击退出按钮
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div/div[2]/div/div/div/div[1]/div[2]")).click();
	    //driver.findElement(By.cssSelector(".ant-col-18")).click();		
		driver.quit();
	}	
	
	
	
	
}

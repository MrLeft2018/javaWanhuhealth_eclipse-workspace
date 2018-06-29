package com.crm.page;

import org.openqa.selenium.*;

//定义登录页面各种需要元素对象
public class LoginPage {
		//初始element返回值为null
		private static WebElement element = null;
		
		private String baseUrl;
		
		public String getBaseUrl() {
			return baseUrl;
		}
		
		public void setBaseUrl(String baseUrl) {
			this.baseUrl = baseUrl;
		}
		
		//定义登录方法中UserName元素参数返回值
		public static WebElement login_UserName(WebDriver driver){
		element = driver.findElement(By.id("userName"));
		return element;
		}
		//定义登录方法中Password元素参数返回值
		public static WebElement login_Password(WebDriver driver){
		element = driver.findElement(By.id("password"));
		return element;
		}
		//定义登录方法中登录按钮login_Button元素参数返回值
		public static WebElement login_Button(WebDriver driver){
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
		}
		//定义登录方法中错误弹框中确定按钮login_Error_Button元素参数返回值
		public static WebElement login_Error_Button(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary.ant-btn-lg"));
		return element;
		}
		
		/*public static WebElement login_User(WebDriver driver){
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
		}
		*/
		//定义退出方法中退出按钮logout_Button元素返回值
		public static WebElement logout_Button(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-col-14"));
		return element;
		}
		
		//定义登录方法中页面错误提示login_Error_Hint1元素参数返回值
		public static WebElement login_Error_Hint1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/span"));
		return element;
		}
		//定义登录方法中页面错误弹窗提示login_Error_Hint2元素参数返回值
		public static WebElement login_Error_Hint2(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-confirm-content"));
		return element;
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
	
	

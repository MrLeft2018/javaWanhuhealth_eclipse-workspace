package com.crm.page;

import org.openqa.selenium.*;


//�����¼ҳ�������ҪԪ�ض���
public class LoginPage {
		//��ʼelement����ֵΪnull
		private static WebElement element = null;
		//�����¼������UserNameԪ�ز�������ֵ
		public static WebElement login_UserName(WebDriver driver){
		element = driver.findElement(By.id("userName"));
		return element;
		}
		//�����¼������PasswordԪ�ز�������ֵ
		public static WebElement login_Password(WebDriver driver){
		element = driver.findElement(By.id("password"));
		return element;
		}
		//�����¼�����е�¼��ťlogin_ButtonԪ�ز�������ֵ
		public static WebElement login_Button(WebDriver driver){
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
		}
		//�����¼�����д��󵯿���ȷ����ťlogin_Error_ButtonԪ�ز�������ֵ
		public static WebElement login_Error_Button(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary.ant-btn-lg"));
		return element;
		}
		
		/*public static WebElement login_User(WebDriver driver){
		element = driver.findElement(By.xpath("//button[@type='submit']"));
		return element;
		}
		*/
		//�����˳��������˳���ťlogout_ButtonԪ�ط���ֵ
		public static WebElement logout_Button(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-col-14"));
		return element;
		}
		
		//�����¼������ҳ�������ʾlogin_Error_Hint1Ԫ�ز�������ֵ
		public static WebElement login_Error_Hint1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='root']/div/div[2]/span"));
		return element;
		}
		//�����¼������ҳ����󵯴���ʾlogin_Error_Hint2Ԫ�ز�������ֵ
		public static WebElement login_Error_Hint2(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-confirm-content"));
		return element;
		}
		}
	
	

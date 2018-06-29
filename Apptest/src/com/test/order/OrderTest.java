package com.test.order;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class OrderTest {
	//��ʼ��AppiumDriver
		private AppiumDriver driver;
		
		//ִ������ǰִ��һ��׼������
	@BeforeSuite
		public void steUp() throws Exception {
			/*
			//����App·��	
		*/
		  DesiredCapabilities cap = new DesiredCapabilities();
	      cap.setCapability(CapabilityType.BROWSER_NAME, ""); 
	      cap.setCapability("platformName", "Android"); //ָ������ƽ̨
	      cap.setCapability("deviceName", "5ab0fae3"); //ָ�����Ի���ID,ͨ��adb����`adb devices`��ȡ
	      cap.setCapability("platformVersion", "4.4.4"); 
	      //�������ȡ���İ�����Activity������Ϊֵ
	      cap.setCapability("appPackage", "com.wanhuhealth.wanhupatient.test");
	      cap.setCapability("appActivity", "com.wanhuhealth.wanhupatient.app.activity.LoginActivity");
	      //A new session could not be created�Ľ������
	      cap.setCapability("appWaitActivity","com.wanhuhealth.wanhupatient.app.activity.LoginActivity");
	      //ÿ������ʱ����session������ڶ��κ����лᱨ�����½�session
	      cap.setCapability("sessionOverride", true);
	      cap.setCapability("exported", true);
	      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
		}
		
	@Test
	    public void addContact() throws InterruptedException{
			driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_num").click();
			driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_num").sendKeys("18301697072");
			driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_secret").click();
			driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_secret").sendKeys("123456");
			//driver.findElementById("com.wanhuhealth.wanhupatient.test").click();  
			//driver.findElementById("com.zhihu.android:id/username").sendKeys("�ֻ���");  
		   // driver.findElementById("com.zhihu.android:id/password").sendKeys("��¼����");  
		   // driver.findElementById("com.zhihu.android:id/fullname").sendKeys("�û��ǳ�");  
			driver.findElementByName("��¼").click();
		    Thread.sleep(2000); 
	       // System.out.println("App is done!");

	    }

	@AfterSuite
	    public void tearDown() throws Exception {

	        driver.quit();

	    }
	

}

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
	//初始化AppiumDriver
		private AppiumDriver driver;
		
		//执行用例前执行一次准备环境
	@BeforeSuite
		public void steUp() throws Exception {
			/*
			//设置App路径	
		*/
		  DesiredCapabilities cap = new DesiredCapabilities();
	      cap.setCapability(CapabilityType.BROWSER_NAME, ""); 
	      cap.setCapability("platformName", "Android"); //指定测试平台
	      cap.setCapability("deviceName", "5ab0fae3"); //指定测试机的ID,通过adb命令`adb devices`获取
	      cap.setCapability("platformVersion", "4.4.4"); 
	      //将上面获取到的包名和Activity名设置为值
	      cap.setCapability("appPackage", "com.wanhuhealth.wanhupatient.test");
	      cap.setCapability("appActivity", "com.wanhuhealth.wanhupatient.app.activity.LoginActivity");
	      //A new session could not be created的解决方法
	      cap.setCapability("appWaitActivity","com.wanhuhealth.wanhupatient.app.activity.LoginActivity");
	      //每次启动时覆盖session，否则第二次后运行会报错不能新建session
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
			//driver.findElementById("com.zhihu.android:id/username").sendKeys("手机号");  
		   // driver.findElementById("com.zhihu.android:id/password").sendKeys("登录密码");  
		   // driver.findElementById("com.zhihu.android:id/fullname").sendKeys("用户昵称");  
			driver.findElementByName("登录").click();
		    Thread.sleep(2000); 
	       // System.out.println("App is done!");

	    }

	@AfterSuite
	    public void tearDown() throws Exception {

	        driver.quit();

	    }
	

}

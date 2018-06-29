package com.order.main;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.Netapi32Util.User;
import com.sun.jna.platform.win32.WinUser.INPUT;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Go {
	//初始化AppiumDriver
	public AppiumDriver driver;
	
	//执行用例前执行一次准备环境
@BeforeSuite
	public void steUp() throws Exception {
		
		//设置App路径	
		DesiredCapabilities capa = new DesiredCapabilities();
		
		capa.setCapability(CapabilityType.BROWSER_NAME, ""); 
		
        capa.setCapability("platformName", "Android");
		
        capa.setCapability("deviceName","5ab0fae3");

        capa.setCapability("platformVersion", "4.4.4");
        
        capa.setCapability("appPackage", "com.wanhuhealth.wanhupatient.test");

        capa.setCapability("appActivity", "com.wanhuhealth.wanhupatient.app.activity.LoginActivity");
         
        capa.setCapability("sessionOverride", true);//每次启动时覆盖session，否则第二次后运行会报错不能新建session
        
        capa.setCapability("unicodekeyboard", true);//设置键盘 使用unicodeKeyboard的编码方式来发送字符串
        
        capa.setCapability("resetKeyboard", true);//将键盘给隐藏起来
        
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capa);

        //System.out.println("App is launched!");
	}
	
@Test
    public void addContact() throws Exception{
		driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_num").click();
		driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_num").sendKeys("18301697072");//18301697072
		driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_secret").click();
		driver.findElementById("com.wanhuhealth.wanhupatient.test:id/edit_secret").sendKeys("123456");
		driver.findElementByName("登    录").click();
	    Thread.sleep(3000); 
	    // System.out.println("Test App! OK!!!");
        
	    driver.findElementById("com.wanhuhealth.wanhupatient.test:id/btn_tosearch").click();
	    //Thread.sleep(2000); 
	    driver.findElementById("com.wanhuhealth.wanhupatient.test:id/btn_tosearch").click();
	   
	    driver.findElementById("com.wanhuhealth.wanhupatient.test:id/btn_tosearch").sendKeys("糖");

	    driver.findElementById("com.wanhuhealth.wanhupatient.test:id/btn_tosearch").sendKeys();
	   // String cmdstr="adb shell input keyevent 66";
	    //Runtime.getRuntime().exec(cmdstr).waitFor();
	    Thread.sleep(3000);
	    //driver.findElementById("com.wanhuhealth.wanhupatient.test:id/btn_tosearch").sendKeys("66");
	    
        //driver.findElementByClassName("android.widget.LinearLayout").click();
        
    }

@AfterSuite
    public void tearDown() throws Exception {

        driver.quit();

    }
	
}

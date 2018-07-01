package com.crm.seleniumDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.seleniumDemo.seleniumCrmDemo;
import com.crm.page.LoginPage;
import com.crm.publics.LoginUser;
import com.crm.publics.OrderOMS;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class runing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("srart selenium");
		 //chrom详细地址 
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");	
		//定义浏览器  
		
		//chromeOptions = new ChromeOptions();
//	    chromeOptions.addArguments("headless");
//	    chromeOptions.addArguments("disable-gpu");
	    
	    
//	    firefoxBinary = new FirefoxBinary();
//	    firefoxBinary.addCommandLineOptions("--headless");
//	    System.setProperty("webdriver.gecko.driver", "/opt/geckodriver");
//	    firefoxOptions = new FirefoxOptions();
//	    firefoxOptions.setBinary(firefoxBinary);
		
	    //driver = new FirefoxDriver();
	    WebDriver driver = new ChromeDriver();//chromeOptions
	    //初始测试地址
	    String baseUrl = "http://demo-crm.wanhuhealth.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/");
	    driver.manage().window().maximize();
	    //调用login方法以及传入参数
	    LoginUser.login(driver, "testwanhu","a12345678");
	    OrderOMS.order_newOrder(driver);
	    OrderOMS.order_navigation_Bar(driver);
	    OrderOMS.order_menu_Little(driver);
	    LoginUser.logout(driver);
}
}	

package com.crm.seleniumDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.crm.seleniumDemo.seleniumCrmDemo;
import com.crm.page.LoginPage;
import com.crm.publics.LoginUser;
import com.crm.publics.OrderOMS;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class Runing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("start selenium");
		 //chrom详细地址 
		System.setProperty("webdriver.chrome.driver","K:\\java\\JaWebdriver\\chromedriver.exe");	
		//给屈赫用下面的地址
		//System.setProperty("webdriver.chrome.driver","/opt/google/chrome/chromedriver");	
		//定义浏览器  
		ChromeOptions chromeOptions;
		chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--headless");
	    chromeOptions.addArguments("--disable-gpu");
	    chromeOptions.addArguments("--proxy-server='direct://'");
	    chromeOptions.addArguments("--proxy-bypass-list=*");
	    chromeOptions.addArguments("--disable-dev-shm-usage");
	    chromeOptions.addArguments("--no-sandbox");
	      

//	    firefoxBinary = new FirefoxBinary();
//	    firefoxBinary.addCommandLineOptions("--headless");
	    //System.setProperty("webdriver.gecko.driver", "/opt/google/chrome/chromedriver");
//	    firefoxOptions = new FirefoxOptions();
//	    firefoxOptions.setBinary(firefoxBinary);
		
	    //driver = new FirefoxDriver();
	    //屈赫的窗口
	    //WebDriver driver = new ChromeDriver(chromeOptions);//chromeOptions
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

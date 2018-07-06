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
		 //chrom��ϸ��ַ 
		System.setProperty("webdriver.chrome.driver","K:\\java\\JaWebdriver\\chromedriver.exe");	
		//������������ĵ�ַ
		//System.setProperty("webdriver.chrome.driver","/opt/google/chrome/chromedriver");	
		//���������  
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
	    //���յĴ���
	    //WebDriver driver = new ChromeDriver(chromeOptions);//chromeOptions
	    WebDriver driver = new ChromeDriver();//chromeOptions
	    //��ʼ���Ե�ַ
	    String baseUrl = "http://demo-crm.wanhuhealth.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/");
	    driver.manage().window().maximize();
	    //����login�����Լ��������
	    LoginUser.login(driver, "testwanhu","a12345678");
	    OrderOMS.order_newOrder(driver);
	    OrderOMS.order_navigation_Bar(driver);
	    OrderOMS.order_menu_Little(driver);
	    LoginUser.logout(driver);
}
}	

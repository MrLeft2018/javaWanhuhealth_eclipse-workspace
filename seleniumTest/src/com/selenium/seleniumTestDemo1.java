package com.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class seleniumTestDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//浏览器没有安装在默认路径下需调用
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//启用chrome时要根据chrome版本下载对应的webdriver驱动
		//		System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");
		//		WebDriver driver = new ChromeDriver();
		
		//定义的WebDriver driver是操作浏览器的，之后实例化对象FirefoxDriver
		WebDriver driver = new FirefoxDriver();
		//给地址对象赋值
		String testUrl = "http://d.crm.wanhuhealth.com/";
		//调用打开地址
		driver.get(testUrl);
		//清空登录页面信息并输入用户名、密码
		driver.manage().window().maximize();
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("wanhu");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("admin");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // Thread.sleep(1000);
	   //driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span")).click();
	    //实例化鼠标事件对象action
	    Actions action = new Actions(driver);    
	    //鼠标悬停并执行存储行为.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span"))).perform();	
	    //点击退出按钮
	    driver.findElement(By.cssSelector(".ant-col-14")).click();		
		driver.quit();
		
	}

}

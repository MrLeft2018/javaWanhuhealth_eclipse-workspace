package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BCWebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//启用chrome时要根据chrome版本下载对应的webdriver驱动
		System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//启用IE时要根据IE版本下载对应的webdriver驱动
		//System.setProperty("webdriver.ie.driver", "K:\\JaWebdriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		String testUrl = "http://www.baidu.com";
		driver.get(testUrl);
		//设置等待时间
		Thread.sleep(3000);
		//driver.quit();
		

	}

}

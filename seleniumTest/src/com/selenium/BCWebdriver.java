package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BCWebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//����chromeʱҪ����chrome�汾���ض�Ӧ��webdriver����
		System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//����IEʱҪ����IE�汾���ض�Ӧ��webdriver����
		//System.setProperty("webdriver.ie.driver", "K:\\JaWebdriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		String testUrl = "http://www.baidu.com";
		driver.get(testUrl);
		//���õȴ�ʱ��
		Thread.sleep(3000);
		//driver.quit();
		

	}

}

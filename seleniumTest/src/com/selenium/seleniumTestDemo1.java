package com.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class seleniumTestDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//�����û�а�װ��Ĭ��·���������
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//����chromeʱҪ����chrome�汾���ض�Ӧ��webdriver����
		//		System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");
		//		WebDriver driver = new ChromeDriver();
		
		//�����WebDriver driver�ǲ���������ģ�֮��ʵ��������FirefoxDriver
		WebDriver driver = new FirefoxDriver();
		//����ַ����ֵ
		String testUrl = "http://d.crm.wanhuhealth.com/";
		//���ô򿪵�ַ
		driver.get(testUrl);
		//��յ�¼ҳ����Ϣ�������û���������
		driver.manage().window().maximize();
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("wanhu");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("admin");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // Thread.sleep(1000);
	   //driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span")).click();
	    //ʵ��������¼�����action
	    Actions action = new Actions(driver);    
	    //�����ͣ��ִ�д洢��Ϊ.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span"))).perform();	
	    //����˳���ť
	    driver.findElement(By.cssSelector(".ant-col-14")).click();		
		driver.quit();
		
	}

}

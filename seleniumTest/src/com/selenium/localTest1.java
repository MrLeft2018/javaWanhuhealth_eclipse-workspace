package com.selenium;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.DirContext;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;
public class localTest1 {
	
	public static void main(String[] args) {
		WebDriver driver;
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		//�ȴ�ʱ������
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//����findElement�Ƕ�λ��һ��һ��Ԫ�أ���λһ��ķ�ʽ��findElements
		//ͨ��ID��λ��ʵ�ַ�ʽ��findElement(By.id(Ԫ������)).sendKeys("����ֵ");��λ������
		//driver.findElement(By.id("kw")).sendKeys("selenium");
		//ͬ��ͨ��name��className��λ
		//driver.findElement(By.name("wd")).sendKeys("webdriver");
		//driver.findElement(By.className("s_ipt")).sendKeys("test");
		//tagName�Ƕ�λ��ǩ�����ǵ��ж����ͬ��ǩ��ʱ��Ĭ��ȡ��һ��������������hidden�ǲ���չʾ�ģ�����Ҫ�ж�һ������ָ���ҵ���Ӧ��
		//�Ҳ��� driver.findElement(By.tagName("inpot")).sendKeys("test2");
		//ͨ������By.linkText��By.partialLinkText��λ��һ���Ǿ�ȷһ������ģ�����ӣ�
		//driver.findElement(By.linkText("����")).click();
		//driver.findElement(By.partialLinkText("��")).click();
		//By.xpath���htmlһ��һ�㶨λ
		//driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("selenium");
		//By.cssSelector���htmlһ��һ�㶨λ
		//driver.findElement(By.cssSelector("#kw")).sendKeys("test");
		//����һ����λԪ����table������˼������ꡣҲ�Ǹ������з�˼ά��ʽ�Ķ�λԪ��
		
		
		
		
	}

}

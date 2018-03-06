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
		//等待时间设置
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//补充findElement是定位单一的一个元素，定位一组的方式是findElements
		//通过ID定位，实现方式：findElement(By.id(元素名称)).sendKeys("输入值");定位并输入
		//driver.findElement(By.id("kw")).sendKeys("selenium");
		//同样通过name和className定位
		//driver.findElement(By.name("wd")).sendKeys("webdriver");
		//driver.findElement(By.className("s_ipt")).sendKeys("test");
		//tagName是定位标签，但是当有多个相同标签的时候默认取第一个，但是类型是hidden是不能展示的，所以要判断一下类型指导找到对应的
		//找不到 driver.findElement(By.tagName("inpot")).sendKeys("test2");
		//通过链接By.linkText和By.partialLinkText定位（一个是精确一个个是模糊链接）
		//driver.findElement(By.linkText("新闻")).click();
		//driver.findElement(By.partialLinkText("新")).click();
		//By.xpath会从html一层一层定位
		//driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("selenium");
		//By.cssSelector会从html一层一层定位
		//driver.findElement(By.cssSelector("#kw")).sendKeys("test");
		//还有一个定位元素是table，它的思想是灵魂。也是更贴近研发思维方式的定位元素
		
		
		
		
	}

}

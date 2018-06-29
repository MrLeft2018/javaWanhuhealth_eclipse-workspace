package LyCrmTest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import LyCrmTest.LyCrmMain;

//LyPublic extends LyCrmMain 方法

public class LyPublic extends LyCrmMain {
	
	//启用chrome时要根据chrome版本下载对应的webdriver驱动
	//System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//定义的WebDriver driver是操作浏览器的，之后实例化对象FirefoxDriver
	//WebDriver driver = new FirefoxDriver();
	//给地址对象赋值
	//String loginUrl="http://d.crm.wanhuhealth.com/";
	
	//创建只对子类和同一个包中的类公开的login

	public void longin(){
	
		
		//调用打开地址
		driver.get(loginUrl);
		//清空登录页面信息并输入用户名、密码
		//错误
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("wanh");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//正确
		driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("wanhu");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("admin");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // Thread.sleep(1000);
	}
	public void quit() {
		//driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span")).click();
	   // 实例化鼠标事件对象action
	    Actions action = new Actions(driver);    
	   // 鼠标悬停并执行存储行为.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span"))).perform();
	   //driver.findElement(By.cssSelector(".ant-popover-open"));// action.clickAndHold().perform();	
	  //  点击退出按钮
	    driver.findElement(By.cssSelector(".ant-col-14")).click();		
		driver.quit();
	}
	
	}

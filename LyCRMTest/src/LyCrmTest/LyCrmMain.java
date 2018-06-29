package LyCrmTest;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LyCrmMain {
	
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
		//给地址对象赋值
	String loginUrl="http://d.crm.wanhuhealth.com/";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");
		
		LyPublic lyPublic = new LyPublic();
		lyPublic.longin();		
		lyPublic.quit();
	}
	
	

}

package LyCrmTest;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import LyCrmTest.LyCrmMain;

//LyPublic extends LyCrmMain ����

public class LyPublic extends LyCrmMain {
	
	//����chromeʱҪ����chrome�汾���ض�Ӧ��webdriver����
	//System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//�����WebDriver driver�ǲ���������ģ�֮��ʵ��������FirefoxDriver
	//WebDriver driver = new FirefoxDriver();
	//����ַ����ֵ
	//String loginUrl="http://d.crm.wanhuhealth.com/";
	
	//����ֻ�������ͬһ�����е��๫����login

	public void longin(){
	
		
		//���ô򿪵�ַ
		driver.get(loginUrl);
		//��յ�¼ҳ����Ϣ�������û���������
		//����
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("wanh");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//��ȷ
		driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("wanhu");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("admin");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // Thread.sleep(1000);
	}
	public void quit() {
		//driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span")).click();
	   // ʵ��������¼�����action
	    Actions action = new Actions(driver);    
	   // �����ͣ��ִ�д洢��Ϊ.perform
	    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span"))).perform();
	   //driver.findElement(By.cssSelector(".ant-popover-open"));// action.clickAndHold().perform();	
	  //  ����˳���ť
	    driver.findElement(By.cssSelector(".ant-col-14")).click();		
		driver.quit();
	}
	
	}

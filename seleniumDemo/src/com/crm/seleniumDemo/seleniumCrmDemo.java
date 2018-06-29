package com.crm.seleniumDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.assertEquals;

import com.crm.page.LoginPage;
import com.crm.publics.LoginUser;
import com.crm.publics.OrderOMS;
import org.testng.annotations.Test;
import org.testng.Reporter;
//import sun.util.logging.resources.logging;


//������������д����¼������֤��
public class seleniumCrmDemo<firefoxOptions> {
	public WebDriver driver;
	public String baseUrl;
//  private ChromeOptions chromeOptions;
//  private FirefoxBinary firefoxBinary;
//  private FirefoxOptions firefoxOptions;


 // private boolean acceptNextAlert = true;
 // private StringBuffer verificationErrors = new StringBuffer();

//ִ��@testǰ׼��ִֻ��һ�� 
  @BeforeSuite
public void  setUp()  {
	 //chrom��ϸ��ַ 
	System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");	
	//���������  
	
	//chromeOptions = new ChromeOptions();
//    chromeOptions.addArguments("headless");
//    chromeOptions.addArguments("disable-gpu");
    
    
//    firefoxBinary = new FirefoxBinary();
//    firefoxBinary.addCommandLineOptions("--headless");
//    System.setProperty("webdriver.gecko.driver", "/opt/geckodriver");
//    firefoxOptions = new FirefoxOptions();
//    firefoxOptions.setBinary(firefoxBinary);
	
    //driver = new FirefoxDriver();
    driver = new ChromeDriver();//chromeOptions
    //��ʼ���Ե�ַ
    baseUrl = "http://demo-crm.wanhuhealth.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  
  
//����@test��������Ķ�������
  @DataProvider
  (name="user3")
  public Object[][] Users3(){
	  return new Object[][]{
		//���������ݣ�ҳ��ʵ�֡���������ʾ
		 {"testwanhu","a12345678","��¼�ɹ�"}, 
	  };
  }
  
  @Test
  (dataProvider="user3")
  public void login(String username,String password,String expectText) throws Exception {
 	 driver.get(baseUrl + "/");
     driver.manage().window().maximize();
     //����login�����Լ��������
     LoginUser.login(driver, username, password);
   }

 @Test
 //(dependsOnMethods = {"login"})
 public void test_Order_1Management() throws Exception {
    //���Ӷ�����ѯ����
    // OrderOMS.order_select(driver);
    //�½��������������������½���
    OrderOMS.order_newOrder(driver);
  }
 
 @Test
 //(dependsOnMethods = {"login"})
 public void test_Order_2Navigation_Bar() throws Exception {
    //�½�����������ͼ���½���
    OrderOMS.order_navigation_Bar(driver);
  }

 @Test
 //(dependsOnMethods = {"login"})
 public void test_Order_3Menu_Little() throws Exception {
    //�½������������ڣ�
    OrderOMS.order_menu_Little(driver);
  }
 
 //@Test
 
//ִ�������в��Գ�����ִ��
@AfterSuite
 //�˳�
 public void tearDown() throws Exception {
	 LoginUser.logout(driver);
 }
}

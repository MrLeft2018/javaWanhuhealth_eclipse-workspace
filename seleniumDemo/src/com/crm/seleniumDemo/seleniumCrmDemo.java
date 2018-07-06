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


//主测试用例编写（登录功能验证）
public class seleniumCrmDemo<firefoxOptions> {
	public WebDriver driver;
	public String baseUrl;
    private ChromeOptions chromeOptions;
//  private FirefoxBinary firefoxBinary;
//  private FirefoxOptions firefoxOptions;


 // private boolean acceptNextAlert = true;
 // private StringBuffer verificationErrors = new StringBuffer();

//执行@test前准备只执行一次 
  @BeforeSuite
public void  setUp()  {
	 //chrom详细地址 
	System.setProperty("webdriver.chrome.driver","K:\\java\\JaWebdriver\\chromedriver.exe");	
	//定义浏览器  
	
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
    //初始测试地址
    baseUrl = "http://demo-crm.wanhuhealth.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  
  
//定义@test中需输入的对象数组
  @DataProvider
  (name="user3")
  public Object[][] Users3(){
	  return new Object[][]{
		//数组中数据，页面实现——弹出提示
		 {"testwanhu","a12345678","登录成功"}, 
	  };
  }
  
  @Test
  (dataProvider="user3")
  public void login(String username,String password,String expectText) throws Exception {
 	 driver.get(baseUrl + "/");
     driver.manage().window().maximize();
     //调用login方法以及传入参数
     LoginUser.login(driver, username, password);
   }

 @Test
 //(dependsOnMethods = {"login"})
 public void test_Order_1Management() throws Exception {
    //增加订单查询功能
    // OrderOMS.order_select(driver);
    //新建订单（订单管理正常新建）
    OrderOMS.order_newOrder(driver);
  }
 
 @Test
 //(dependsOnMethods = {"login"})
 public void test_Order_2Navigation_Bar() throws Exception {
    //新建订单（详情图标新建）
    OrderOMS.order_navigation_Bar(driver);
  }

 @Test
 //(dependsOnMethods = {"login"})
 public void test_Order_3Menu_Little() throws Exception {
    //新建订单（快捷入口）
    OrderOMS.order_menu_Little(driver);
  }
 
 //@Test
 
//执行完所有测试场景后执行
@AfterSuite
 //退出
 public void tearDown() throws Exception {
	 LoginUser.logout(driver);
 }
}

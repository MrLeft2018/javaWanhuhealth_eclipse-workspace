package com.crmtestng;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.assertEquals;
import com.crm.publics.LoginUser;
import com.crm.publics.OrderOMS;
import sun.util.logging.resources.logging;


//主测试用例编写（登录功能验证）
public class selenuimCrmTest {
  private WebDriver driver;
  private String baseUrl;

 // private boolean acceptNextAlert = true;
 // private StringBuffer verificationErrors = new StringBuffer();

//执行@test前准备只执行一次 
  @BeforeSuite
public void  setUp()  {
	 //chrom详细地址 
	System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");	
	//定义浏览器  
    driver = new FirefoxDriver();
	//driver = new ChromeDriver();
    //初始测试地址
    baseUrl = "http://t.crm.wanhuhealth.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
//定义@test中需输入的对象数组
  @DataProvider
  (name="user1")
  public Object[][] Users1(){
	  return new Object[][]{
		  //数组中数据，页面实现——直接提示
		  {"wanhu","123","密码不正确"},
		  {"wanh","1236","用户名 wanh 没有找到"},
	  };
  }
  
//定义@test中需输入的对象数组
  @DataProvider
  (name="user2")
  public Object[][] Users2(){
	  return new Object[][]{
		//数组中数据，页面实现——弹出提示
		 {"","","请输入用户名或密码"},
		 {"wanhu","","请输入用户名或密码"},
		 {"","1231","请输入用户名或密码"},
 
	  };
  }
  
//定义@test中需输入的对象数组
  @DataProvider
  (name="user3")
  public Object[][] Users3(){
	  return new Object[][]{
		//数组中数据，页面实现——弹出提示
		 {"wanhu","123456",""}, 
	  };
  }
  
//定义测试执行部分以及对应调用的数组@dataproider
  @Test
  (dataProvider="user1")
  public void testCrmNg1(String username,String password,String expectText) throws Exception {
	//输入测试url
	driver.get(baseUrl + "/");
	//最大化窗口
    driver.manage().window().maximize();
    //调用login方法以及传入参数
    LoginUser.login(driver,username,password);
    //判断输入的数据和两种不同提示语选择对应的报错信息采集
    String text1 = LoginUser.login_error_info1(driver);
    //对比数据是否一致
    Assert.assertEquals(text1,expectText);
    //输入测试数据系统后返回值
   // System.out.println(text1);
    //期望的返回值
   // System.out.println(expectText);
  }
  
//定义测试执行部分以及对应调用的数组@dataproider
  @Test
  (dataProvider="user2")
  public void testCrmNg2(String username,String password,String expectText) throws Exception {
	driver.get(baseUrl + "/");
    driver.manage().window().maximize();
  //调用login1方法以及传入参数
    LoginUser.login1(driver, username, password);
    //判断输入的数据和两种不同提示语选择对应的报错信息采集
    String text2 = LoginUser.login_error_info2(driver);
    //对比数据是否一致
    Assert.assertEquals(text2,expectText);
    //输入测试数据系统后返回值
  //  System.out.println(text2);
    //期望的返回值
  //  System.out.println(expectText);   
  }

 @Test
 (dataProvider="user3")
 public void testCrmNg3(String username,String password,String expectText) throws Exception {
	driver.get(baseUrl + "/");
    driver.manage().window().maximize();
  //调用login方法以及传入参数
    LoginUser.login(driver, username, password);
    //增加订单查询功能
    OrderOMS.order_select(driver);
  //新建订单功能
    OrderOMS.order_establish(driver);
 
  }
 
 @Test
 
//执行完所有测试场景后执行
@AfterSuite
 //退出
 public void tearDown() throws Exception {
	 LoginUser.logout(driver);
 }
}

package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
//引用driver包
import org.openqa.selenium.firefox.FirefoxDriver;
//鼠标事件包
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCRM {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.1.10.22:38020/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCRM() throws Exception {
	Actions action = new Actions(driver);    
    driver.get(baseUrl + "/login?redirect_uri=http%3A%2F%2Fd.crm.wanhuhealth.com%2Fuser%2Fr%3Fr%3D%252F");
    driver.findElement(By.id("userName")).clear();
    driver.findElement(By.id("userName")).sendKeys("wanhu");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    //最大化窗口
    driver.manage().window().maximize();
    //鼠标悬停并执行存储行为.perform
    
    action.clickAndHold(driver.findElement(By.xpath(".//*[@id='header']/div[1]/div[5]/span"))).perform();	
    //点击退出按钮
    driver.findElement(By.cssSelector(".ant-col-14")).click();	
    //等待时间
    Thread.sleep(3000);
    driver.quit();
   
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

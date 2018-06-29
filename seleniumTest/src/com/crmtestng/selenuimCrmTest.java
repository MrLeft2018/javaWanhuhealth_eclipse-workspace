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


//������������д����¼������֤��
public class selenuimCrmTest {
  private WebDriver driver;
  private String baseUrl;

 // private boolean acceptNextAlert = true;
 // private StringBuffer verificationErrors = new StringBuffer();

//ִ��@testǰ׼��ִֻ��һ�� 
  @BeforeSuite
public void  setUp()  {
	 //chrom��ϸ��ַ 
	System.setProperty("webdriver.chrome.driver","K:\\JaWebdriver\\chromedriver.exe");	
	//���������  
    driver = new FirefoxDriver();
	//driver = new ChromeDriver();
    //��ʼ���Ե�ַ
    baseUrl = "http://t.crm.wanhuhealth.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
//����@test��������Ķ�������
  @DataProvider
  (name="user1")
  public Object[][] Users1(){
	  return new Object[][]{
		  //���������ݣ�ҳ��ʵ�֡���ֱ����ʾ
		  {"wanhu","123","���벻��ȷ"},
		  {"wanh","1236","�û��� wanh û���ҵ�"},
	  };
  }
  
//����@test��������Ķ�������
  @DataProvider
  (name="user2")
  public Object[][] Users2(){
	  return new Object[][]{
		//���������ݣ�ҳ��ʵ�֡���������ʾ
		 {"","","�������û���������"},
		 {"wanhu","","�������û���������"},
		 {"","1231","�������û���������"},
 
	  };
  }
  
//����@test��������Ķ�������
  @DataProvider
  (name="user3")
  public Object[][] Users3(){
	  return new Object[][]{
		//���������ݣ�ҳ��ʵ�֡���������ʾ
		 {"wanhu","123456",""}, 
	  };
  }
  
//�������ִ�в����Լ���Ӧ���õ�����@dataproider
  @Test
  (dataProvider="user1")
  public void testCrmNg1(String username,String password,String expectText) throws Exception {
	//�������url
	driver.get(baseUrl + "/");
	//��󻯴���
    driver.manage().window().maximize();
    //����login�����Լ��������
    LoginUser.login(driver,username,password);
    //�ж���������ݺ����ֲ�ͬ��ʾ��ѡ���Ӧ�ı�����Ϣ�ɼ�
    String text1 = LoginUser.login_error_info1(driver);
    //�Ա������Ƿ�һ��
    Assert.assertEquals(text1,expectText);
    //�����������ϵͳ�󷵻�ֵ
   // System.out.println(text1);
    //�����ķ���ֵ
   // System.out.println(expectText);
  }
  
//�������ִ�в����Լ���Ӧ���õ�����@dataproider
  @Test
  (dataProvider="user2")
  public void testCrmNg2(String username,String password,String expectText) throws Exception {
	driver.get(baseUrl + "/");
    driver.manage().window().maximize();
  //����login1�����Լ��������
    LoginUser.login1(driver, username, password);
    //�ж���������ݺ����ֲ�ͬ��ʾ��ѡ���Ӧ�ı�����Ϣ�ɼ�
    String text2 = LoginUser.login_error_info2(driver);
    //�Ա������Ƿ�һ��
    Assert.assertEquals(text2,expectText);
    //�����������ϵͳ�󷵻�ֵ
  //  System.out.println(text2);
    //�����ķ���ֵ
  //  System.out.println(expectText);   
  }

 @Test
 (dataProvider="user3")
 public void testCrmNg3(String username,String password,String expectText) throws Exception {
	driver.get(baseUrl + "/");
    driver.manage().window().maximize();
  //����login�����Լ��������
    LoginUser.login(driver, username, password);
    //���Ӷ�����ѯ����
    OrderOMS.order_select(driver);
  //�½���������
    OrderOMS.order_establish(driver);
 
  }
 
 @Test
 
//ִ�������в��Գ�����ִ��
@AfterSuite
 //�˳�
 public void tearDown() throws Exception {
	 LoginUser.logout(driver);
 }
}

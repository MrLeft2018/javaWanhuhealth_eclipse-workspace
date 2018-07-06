package com.crm.publics;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.crm.page.LoginPage;
import com.crm.page.OrderPage;
import com.sun.jna.platform.win32.SetupApi;

public class OrderOMS {
	
	//用药订单管理新建订单
	public static void order_newOrder(WebDriver driver) throws InterruptedException {
		//点击左侧订单管理
		try {
		OrderPage.newOrder_Centre(driver).click();
		Thread.sleep(1000);
		//点击用药订单管理
		OrderPage.newOrder_Management(driver).click();
		Thread.sleep(1000);
		//用药订单管理中新建
		OrderPage.newOrder_newButton(driver).click();
		Thread.sleep(2000);
		//查询选择患者
		OrderPage.newOrder_addClient(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addClient1(driver).sendKeys("L自动化患者");
		Thread.sleep(3000);
		OrderPage.newOrder_addClient2(driver).click();
		Thread.sleep(3000);
		//收件地址选择
		OrderPage.newOrder_addressee(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addressee1(driver).click();
		Thread.sleep(2000);
		//查询添加药品
		OrderPage.newOrder_medicine_AddMedicineToOrder_name(driver).sendKeys("吉泰安");
		//Thread.sleep(2000);
		OrderPage.newOrder_medicine_AddMedicineToOrder_name1(driver).click();
		Thread.sleep(2000);
		//修改药品用法用量和购买数量
		OrderPage.newOrder_buyNumber(driver).clear();
		OrderPage.newOrder_buyNumber(driver).sendKeys("2");
		Thread.sleep(2000);
		//保存创建订单
		OrderPage.newOrder_save(driver).click();
		Thread.sleep(3000);
		//判断关键字（订单状态、患者信息、订单编号）
		String text1 = OrderPage.newOrder_save_hint_info1(driver);
		String text2 = OrderPage.newOrder_save_patient_info2(driver);
		String text3 = OrderPage.newOrder_save_orderNumber_info3(driver);
		//输入测试数据系统后返回值
		System.out.println("登记状态：" + text1 + '\n' + "患者信息：" + text2 + '\n' + "订单编号：" + text3 + '\n');
		Reporter.log("登记状态：" + text1 + '\n' + "患者信息：" + text2 + '\n' + "订单编号：" + text3 + '\n');
		Thread.sleep(2000);
		//创建订单成功后返回
		OrderPage.newOrder_return(driver).click();
		Thread.sleep(2000);	
		}catch (Exception ex) {
		//输出异常到标准错误流
		ex.printStackTrace();
		//使用getMessage()方法输出异常信息
		System.out.println("getMessage 方法："+ex.getMessage());
		Reporter.log("登记用药失败" + '\n' + "问题定位利用getMessage方法确认未找到的元素："+ex.getMessage());
		Thread.sleep(3000);
		//出现问题后，刷新页面到系统首页
		driver.navigate().to("http://demo-crm.wanhuhealth.com");
		Thread.sleep(3000);
		}
		
	}
	
	
	//导航栏创建订单
	public static void order_navigation_Bar(WebDriver driver) throws InterruptedException {
		//点击上方导航栏输入查询条件
		try {
		OrderPage.newOrder_Bar_Name(driver).sendKeys("L自动化患者");
		Thread.sleep(2000);
		OrderPage.newOrder_Bar_Name1(driver).click();
		Thread.sleep(3000);
		//点击患者详情姓名后图标
		OrderPage.newOrder_icon(driver).click();
		Thread.sleep(4000);
		//收件地址选择
		OrderPage.newOrder_addressee(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_menu_addressee1(driver).click();
		Thread.sleep(2000);
		//查询添加药品
		OrderPage.newOrder_medicine_AddMedicineToOrder_name(driver).sendKeys("吉泰安");
		Thread.sleep(2000);
		OrderPage.newOrder_medicine_AddMedicineToOrder_name1(driver).click();
		Thread.sleep(2000);
		//修改药品用法用量和购买数量
		OrderPage.newOrder_buyNumber(driver).clear();
		OrderPage.newOrder_buyNumber(driver).sendKeys("2");
		Thread.sleep(4000);
		//保存创建订单
		OrderPage.newOrder_save(driver).click();
		//OrderPage.newOrder_Bm_save(driver).click();
		Thread.sleep(4000);
		//关键字（订单状态、患者信息、订单编号）
		String bar_text1 = OrderPage.newOrder_Bm_save_hint_info1(driver);
		String bm_text2 = OrderPage.newOrder_Bm_save_patient_info2(driver);
		String bm_text3 = OrderPage.newOrder_Bm_save_orderNumber_info3(driver);
		//输入测试数据系统后返回值
		System.out.println("登记状态：" + bar_text1 + '\n' + "患者信息：" + bm_text2 + '\n' + "订单编号：" + bm_text3 + '\n');
		Reporter.log("登记状态：" + bar_text1 + '\n' + "患者信息：" + bm_text2 + '\n' + "订单编号：" + bm_text3 + '\n');
		Thread.sleep(4000);
		//创建订单成功后返回
		OrderPage.newOrder_Bm_return(driver).click();
		Thread.sleep(2000);
		
		}catch (Exception ex) {
		//输出异常到标准错误流
		ex.printStackTrace();
		//使用getMessage()方法输出异常信息
		System.out.println("getMessage 方法："+ex.getMessage());
		Reporter.log("登记用药失败" + '\n' + "问题定位利用getMessage方法确认未找到的元素："+ex.getMessage());
		Thread.sleep(3000);
		//出现问题后，刷新页面到系统首页
		driver.navigate().to("http://demo-crm.wanhuhealth.com");
		Thread.sleep(3000);
		}
	}

	//快捷入口登记用药创建订单
	public static void order_menu_Little(WebDriver driver) throws InterruptedException {
		// 实例化鼠标事件对象action
		try {
	    Actions menu_action = new Actions(driver); 
		// 鼠标悬停快捷入口并执行存储行为.perform
		menu_action.clickAndHold(OrderPage.menu_Little(driver)).perform();
		//点击登记用药按钮
		OrderPage.menu_Order(driver).click();
		Thread.sleep(2000);
		//查询选择患者
		OrderPage.newOrder_addClient(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addClient1(driver).sendKeys("L自动化患者");
		Thread.sleep(3000);
		OrderPage.newOrder_addClient2(driver).click();
		Thread.sleep(4000);
		//收件地址选择
		OrderPage.newOrder_addressee(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addressee1(driver).click();
		Thread.sleep(2000);
		//查询添加药品
		OrderPage.newOrder_medicine_AddMedicineToOrder_name(driver).sendKeys("吉泰安");
		Thread.sleep(2000);
		OrderPage.newOrder_medicine_AddMedicineToOrder_name1(driver).click();
		Thread.sleep(2000);
		//修改药品用法用量和购买数量
		OrderPage.newOrder_buyNumber(driver).clear();
		OrderPage.newOrder_buyNumber(driver).sendKeys("2");
		Thread.sleep(2000);
		//保存创建订单
		OrderPage.newOrder_save(driver).click();
		//OrderPage.newOrder_Bm_save(driver).click();
		Thread.sleep(3000);
		//关键字（订单状态、患者信息、订单编号）
		String menu_text1 = OrderPage.newOrder_Bm_save_hint_info1(driver);
		String bm_text2 = OrderPage.newOrder_Bm_save_patient_info2(driver);
		String bm_text3 = OrderPage.newOrder_Bm_save_orderNumber_info3(driver);
		//输入测试数据系统后返回值
		System.out.println("登记状态：" + menu_text1 + '\n' + "患者信息：" + bm_text2 + '\n' + "订单编号：" + bm_text3 + '\n');
		Reporter.log("登记状态：" + menu_text1 + '\n' + "患者信息：" + bm_text2 + '\n' + "订单编号：" + bm_text3 + '\n');
		Thread.sleep(4000);
		//创建订单成功后返回
		OrderPage.newOrder_Bm_return(driver).click();
		Thread.sleep(2000);
		
		}catch (Exception ex) {
		//输出异常到标准错误流
		ex.printStackTrace();
		//使用getMessage()方法输出异常信息
		System.out.println("getMessage 方法："+ex.getMessage());
		Reporter.log("登记用药失败" + '\n' + "问题定位利用getMessage方法确认未找到的元素："+ex.getMessage());
		Thread.sleep(3000);
		//出现问题后，刷新页面到系统首页
		driver.navigate().to("http://demo-crm.wanhuhealth.com");
		Thread.sleep(3000);
		}
	}
		
		
	//订单查询
	public static void order_select(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		OrderPage.newOrder_Centre(driver).click();
		Thread.sleep(1000);
		OrderPage.newOrder_Management(driver).click();
		OrderPage.Order_Selectable(driver).click();
		OrderPage.Order_S_Name(driver).click();
		Thread.sleep(1000);
		OrderPage.Order_QueryText(driver).sendKeys("费靖桐");
		Thread.sleep(1000);
		OrderPage.Order_Select(driver).click();
		Thread.sleep(4000);
		}				
	}


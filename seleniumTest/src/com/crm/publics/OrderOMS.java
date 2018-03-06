package com.crm.publics;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import com.crm.page.LoginPage;
import com.crm.page.OrderPage;

public class OrderOMS {
	
		//´´½¨¶©µ¥
	public static void order_establish(WebDriver driver) throws InterruptedException {
		OrderPage.Order_New_Name(driver).sendKeys("ÌÇ´×Ð¡ÅÅ");
		OrderPage.Order_New_Name_En(driver).click();
		Thread.sleep(3000);
		OrderPage.Order_New(driver).click();
		//OrderPage.Order_New_From(driver).click();
		//Thread.sleep(2000);
		//OrderPage.Order_New_From(driver).sendKeys("2016-08-24");
		Thread.sleep(1000);
		OrderPage.Order_New_Pinci(driver).click();
		//Thread.sleep(1000);
		OrderPage.Order_New_Pinci_day(driver).click();
		Thread.sleep(1000);
		OrderPage.Order_New_OK(driver).click();
		Thread.sleep(2000);
		OrderPage.Order_New_Fanhui(driver).click();
		/*OrderPage.Order_Selectable(driver).click();
		OrderPage.Order_S_Name(driver).click();
		Thread.sleep(1000);
		OrderPage.Order_QueryText(driver).sendKeys("ÌÇ´×");
		Thread.sleep(1000);
		//OrderPage.Order_Selectable_State(driver).click();
		//OrderPage.Order_S_State(driver).click();
		OrderPage.Order_Select(driver).click();*/
		Thread.sleep(3000);
		OrderPage.Order_Centre(driver).click();
		OrderPage.Order_Management(driver).click();
		OrderPage.Order_Select(driver).click();
		Thread.sleep(4000);
	}

		
		//¶©µ¥²éÑ¯
		public static void order_select(WebDriver driver) throws InterruptedException {
			OrderPage.Order_Centre(driver).click();
			OrderPage.Order_Management(driver).click();
			OrderPage.Order_Selectable(driver).click();
			OrderPage.Order_S_Name(driver).click();
			Thread.sleep(1000);
			OrderPage.Order_QueryText(driver).sendKeys("ÌÇ´×");
			Thread.sleep(1000);
			OrderPage.Order_Select(driver).click();
			Thread.sleep(4000);
		}
		
		
	}

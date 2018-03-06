package com.crm.page;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByCssSelector;

//定义CRM订单中心页面各种需要元素对象
public class OrderPage {
	//初始element返回值为null
	private static WebElement element = null;
	//定义左侧菜单订单中心Order_Centre元素参数返回值
	public static WebElement Order_Centre(WebDriver driver){
	element = driver.findElement(By.cssSelector(".ant-menu-submenu-title"));
	return element;
	}
	
	//定义订单中心列表中订单管理Order_Management元素参数返回值
	public static WebElement Order_Management(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='2$Menu']/li/span"));
	return element;
	}
	
	//客户详情中新建订单按钮元素Order_New返回值
	public static WebElement Order_New(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[3]/div/div/form/div[1]/div[1]/div/div[2]/div/div/div/a/img"));
	//element = driver.findElement(By.cssSelector("element = driver.findElement(By.cssSelector(\".ant-select-search__field\"));"));
	return element;
	}
	
	//定义上方导航中查询输入框Order_New_Name元素返回值
	public static WebElement Order_New_Name(WebDriver driver){
	//element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[1]/div/div[2]/div/div/div/div"));
	element = driver.findElement(By.cssSelector(".ant-select-search__field"));
	return element;
	}
	
	//定义上方导航中查询选择项Order_New_Name_En元素返回值
	public static WebElement Order_New_Name_En(WebDriver driver){
	element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item"));
	return element;
	}
	
	//新建订单中配送时间Order_New_From元素返回值
	public static WebElement Order_New_From(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[5]/div[2]/div/div[2]/div/span/div/input"));
	return element;
	}
	
	//新建订单中配送时间选则时间Order_New_From_Time元素返回值
	public static WebElement Order_New_From_Time(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div/div/div/div[2]/div[2]/table/tbody/tr[4]/td[5]/div"));
	return element;
	}
	
	//新建订单中选择用药频次框Order_New_Pinci元素返回值
	public static WebElement Order_New_Pinci(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='addCustomerMedicine']/table/tbody[1]/tr[1]/td[4]/div/div/div/div/div"));
	return element;
	}
	
	//新建订单中选择用药频次项Order_New_Pinci元素返回值
	public static WebElement Order_New_Pinci_day(WebDriver driver){
	element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item"));
	//element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[8]/div/div/div/ul/li[1]"));
	return element;
	}
	
	//新建订单中确定按钮定位Order_New_OK元素返回值
	public static WebElement Order_New_OK(WebDriver driver){
	//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
	return element;
	}
	
	//定义登录用药中页面提示Order_Result_Hint1元素参数返回值
	public static WebElement Order_Result_Hint1(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='rcDialogTitle1']"));
	return element;
	}
	
	//订单创建结果页面返回按钮Order_New_Fanhui元素参数返回值
	public static WebElement Order_New_Fanhui(WebDriver driver){
	//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
	return element;
	}
	
	//定义订单管理中查询类型Order_Selectable元素参数返回值
	public static WebElement Order_Selectable(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[1]/div/div/div/div/div"));
	//element = driver.findElement(By.cssSelector(".ant-select-selection.ant-select-selection--single"));
	return element;
	}
	
	//定义订单管理中查询类型Order_S_Name元素参数返回值
	public static WebElement Order_S_Name(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[2]/div/div/div/ul/li[2]"));
	//element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item-selected.ant-select-dropdown-menu-item"));
	return element;
	}
	
	//定义订单管理中查询类型输入数据Order_QueryText元素参数返回值
	public static WebElement Order_QueryText(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='queryText']"));
	return element;
	}
	
	//定义订单管理查询中订单状态元素Order_Selectable_State返回值
	public static WebElement Order_Selectable_State(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[3]/div/div/div/div/div/div/div"));	
	return element;
	}
	
	//定义订单管理查询中订单状态元素Order_S_State返回值
	public static WebElement Order_S_State(WebDriver driver) {
	//element = driver.findElement(By.className(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item-selected.ant-select-dropdown-menu-item"));
	element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]"));	
	return element;
	}
	
	//定义订单管理中查询按钮Order_Select元素参数返回值
	public static WebElement Order_Select(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[6]/button"));
	//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
	return element;
	}
		
		
}
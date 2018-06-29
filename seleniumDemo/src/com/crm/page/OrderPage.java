package com.crm.page;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByCssSelector;

//定义CRM订单中心页面各种需要元素对象
public class OrderPage {
	//初始element返回值为null
	private static WebElement element = null;
	
	//用药订单管理新建订单order_newOrder方法调用元素
	//定义左侧菜单订单中心按钮
	public static WebElement newOrder_Centre(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-menu-submenu-title"));
		return element;
	}
	
	//定义订单中心列表中用药订单管理按钮
	public static WebElement newOrder_Management(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"2$Menu\"]/li/span"));//li[2]/ul/li/span
		return element;
	}
	
	//定义用药订单管理页面新建按钮
	public static WebElement newOrder_newButton(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[7]/button"));
		return element;
	}
	
	//定义登记用药页面选择客户
	public static WebElement newOrder_addClient(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-select-search__field"));
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[1]/div/div[2]/div/div/div/div"));
		return element;
	}
	
	//定义登记用药页面选择客户
	public static WebElement newOrder_addClient1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[1]/div/div[2]/div/div/div/div/div[2]/div/input"));
		return element;
	}
	
	
	//定义查询后选择客户
	public static WebElement newOrder_addClient2(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[7]/div/div/div/ul/li/div"));
		return element;
	}
	
	//定义收件地址
	public static WebElement newOrder_addressee(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[4]/div/div[2]/div/div/div/div/div"));
		return element;
	}	
	
	//定义（正常+快捷）选择收件地址
	public static WebElement newOrder_addressee1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[8]/div/div/div/ul/li[1]/div"));
		//*[@id='addMedicineRegisterForm']/div[7]/div/div/div/ul/li[1]
		return element;
	}
	
	//定义（图标）选择收件地址
	public static WebElement newOrder_menu_addressee1(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='addMedicineRegisterForm']/div[7]/div/div/div/ul/li[1]"));
		return element;
	}
	
	//定义查询药品
	public static WebElement newOrder_medicine_AddMedicineToOrder_name(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='medicine_AddMedicineToOrder_name']/input"));
		return element;
	}
	
	//定义添加药品
	public static WebElement newOrder_medicine_AddMedicineToOrder_name1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='medicine_AddMedicineToOrder_name']/div/div/div/ul/li/div/div[2]/div"));
		return element;
	}
	
	//修改购买数量
	public static WebElement newOrder_buyNumber(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='medicine_7013_amount']"));
		return element;
	}
	
	//修改频次
	public static WebElement newOrder_Hz(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[8]/div/div/div/ul/li[1]/div"));
		return element;
	}
	
	//保存（正常）创建订单
	public static WebElement newOrder_save(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	//保存（图标+快捷）创建订单
	public static WebElement newOrder_Bm_save(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath("//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	//定义创建订单提示信息(正常)
	public static WebElement newOrder_save_hint(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[1]"));
		//System.out.println(element.toString());
		return element;
	}
	
	//定义创建订单提示信息(图标/快捷)
	public static WebElement newOrder_Bm_save_hint(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[1]"));
		//System.out.println(element.toString());
		return element;
	}	
	
	
	//定义创建订单提示包裹患者信息（正常）
	public static WebElement newOrder_save_patient(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]"));
		return element;
	}
	
	//定义创建订单提示包裹患者信息（图标/快捷）
	public static WebElement newOrder_Bm_save_patient(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]"));
		return element;
	}
		
		
	//定义创建订单提示包裹单号信息（正常）
	public static WebElement newOrder_save_orderNumber(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]"));
		return element;
	}
	
	//定义创建订单提示包裹单号信息（图标/快捷）
	public static WebElement newOrder_Bm_save_orderNumber(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]"));
		return element;
	}
		
	
	//获取创建订单成功提示，返回test1（正常）
	public static String newOrder_save_hint_info1(WebDriver driver){
		String text1 = OrderPage.newOrder_save_hint(driver).getText();
		return text1;
	}
	
	//获取创建订单成功提示，返回test1（图标/快捷）
	public static String newOrder_Bm_save_hint_info1(WebDriver driver){
		String bm_text1 = OrderPage.newOrder_Bm_save_hint(driver).getText();
		return bm_text1;
	}
	
	//获取创建订单提示包裹患者信息，返回test2（正常）
	public static String newOrder_save_patient_info2(WebDriver driver){
		String text2 = OrderPage.newOrder_save_patient(driver).getText();
		return text2;
	}
	
	//获取创建订单提示包裹患者信息，返回test2（图标/快捷）
	public static String newOrder_Bm_save_patient_info2(WebDriver driver){
		String bm_text2 = OrderPage.newOrder_Bm_save_patient(driver).getText();
		return bm_text2;
	}
		
	
	//获取创建订单提示包裹单号信息，返回test3（正常）
	public static String newOrder_save_orderNumber_info3(WebDriver driver){
		String text3 = OrderPage.newOrder_save_orderNumber(driver).getText();
		return text3;
	}
	
	//获取创建订单提示包裹单号信息，返回test3（图标/快捷）
	public static String newOrder_Bm_save_orderNumber_info3(WebDriver driver){
		String bm_text3 = OrderPage.newOrder_Bm_save_orderNumber(driver).getText();
		return bm_text3;
	}
	
	//订单创建后返回按钮（正常）
	public static WebElement newOrder_return(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	
	//订单创建后继续登记按钮（正常）
	public static WebElement newOrder_goOn(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[2]"));
		return element;
	}
	
	
	//订单创建后返回按钮（图标+快捷）
	public static WebElement newOrder_Bm_return(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[4]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	//订单创建后继续登记按钮（图标+快捷）
	public static WebElement newOrder_Bm_goOn(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[4]/div/div[2]/div/div[1]/div[3]/div/button[2]"));
		return element;
	}
	
	
	//导航栏新建订单order_navigation_Bar方法调用元素
	//定义上方导航中查询输入框
	public static WebElement newOrder_Bar_Name(WebDriver driver){
		//element = driver.findElement(By.xpath(".//*[@id='globalSearchInput']/div/div/div/div/div/div/ul/li/div/input"));
		element = driver.findElement(By.cssSelector(".ant-select-search__field"));
		return element;
	}
	
	//定义上方导航中查询选项
	public static WebElement newOrder_Bar_Name1(WebDriver driver){
		//element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div/div/ul/li"));
		element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item"));
		return element;
	}
	
	//定义客户详情中图标按钮
	public static WebElement newOrder_icon(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[3]/div/div/form/div[1]/div[1]/div/div[2]/div/div/div/a/img"));
		//element = driver.findElement(By.cssSelector("element = driver.findElement(By.cssSelector(\".ant-select-search__field\"));"));
		return element;
	}
	
	
	//导航栏新建订单order_menu_Little方法调用元素
	//定义上方快捷入口
	public static WebElement menu_Little(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuWrapper']/button"));
		return element;
	}
		
	//定义上方快捷入口登记用药按钮
	public static WebElement menu_Order(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/div/div[2]/div/div/div/div[3]/div[2]"));
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
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div/div/ul/li[2]"));
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
package com.crm.page;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByCssSelector;

//����CRM��������ҳ�������ҪԪ�ض���
public class OrderPage {
	//��ʼelement����ֵΪnull
	private static WebElement element = null;
	//�������˵���������Order_CentreԪ�ز�������ֵ
	public static WebElement Order_Centre(WebDriver driver){
	element = driver.findElement(By.cssSelector(".ant-menu-submenu-title"));
	return element;
	}
	
	//���嶩�������б��ж�������Order_ManagementԪ�ز�������ֵ
	public static WebElement Order_Management(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='2$Menu']/li/span"));
	return element;
	}
	
	//�ͻ��������½�������ťԪ��Order_New����ֵ
	public static WebElement Order_New(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[3]/div/div/form/div[1]/div[1]/div/div[2]/div/div/div/a/img"));
	//element = driver.findElement(By.cssSelector("element = driver.findElement(By.cssSelector(\".ant-select-search__field\"));"));
	return element;
	}
	
	//�����Ϸ������в�ѯ�����Order_New_NameԪ�ط���ֵ
	public static WebElement Order_New_Name(WebDriver driver){
	//element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[1]/div/div[2]/div/div/div/div"));
	element = driver.findElement(By.cssSelector(".ant-select-search__field"));
	return element;
	}
	
	//�����Ϸ������в�ѯѡ����Order_New_Name_EnԪ�ط���ֵ
	public static WebElement Order_New_Name_En(WebDriver driver){
	element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item"));
	return element;
	}
	
	//�½�����������ʱ��Order_New_FromԪ�ط���ֵ
	public static WebElement Order_New_From(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[5]/div[2]/div/div[2]/div/span/div/input"));
	return element;
	}
	
	//�½�����������ʱ��ѡ��ʱ��Order_New_From_TimeԪ�ط���ֵ
	public static WebElement Order_New_From_Time(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div/div/div/div[2]/div[2]/table/tbody/tr[4]/td[5]/div"));
	return element;
	}
	
	//�½�������ѡ����ҩƵ�ο�Order_New_PinciԪ�ط���ֵ
	public static WebElement Order_New_Pinci(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='addCustomerMedicine']/table/tbody[1]/tr[1]/td[4]/div/div/div/div/div"));
	return element;
	}
	
	//�½�������ѡ����ҩƵ����Order_New_PinciԪ�ط���ֵ
	public static WebElement Order_New_Pinci_day(WebDriver driver){
	element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item"));
	//element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[8]/div/div/div/ul/li[1]"));
	return element;
	}
	
	//�½�������ȷ����ť��λOrder_New_OKԪ�ط���ֵ
	public static WebElement Order_New_OK(WebDriver driver){
	//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
	return element;
	}
	
	//�����¼��ҩ��ҳ����ʾOrder_Result_Hint1Ԫ�ز�������ֵ
	public static WebElement Order_Result_Hint1(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='rcDialogTitle1']"));
	return element;
	}
	
	//�����������ҳ�淵�ذ�ťOrder_New_FanhuiԪ�ز�������ֵ
	public static WebElement Order_New_Fanhui(WebDriver driver){
	//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
	return element;
	}
	
	//���嶩�������в�ѯ����Order_SelectableԪ�ز�������ֵ
	public static WebElement Order_Selectable(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[1]/div/div/div/div/div"));
	//element = driver.findElement(By.cssSelector(".ant-select-selection.ant-select-selection--single"));
	return element;
	}
	
	//���嶩�������в�ѯ����Order_S_NameԪ�ز�������ֵ
	public static WebElement Order_S_Name(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='app-body']/div[2]/div/div/div/ul/li[2]"));
	//element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item-selected.ant-select-dropdown-menu-item"));
	return element;
	}
	
	//���嶩�������в�ѯ������������Order_QueryTextԪ�ز�������ֵ
	public static WebElement Order_QueryText(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='queryText']"));
	return element;
	}
	
	//���嶩�������ѯ�ж���״̬Ԫ��Order_Selectable_State����ֵ
	public static WebElement Order_Selectable_State(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[3]/div/div/div/div/div/div/div"));	
	return element;
	}
	
	//���嶩�������ѯ�ж���״̬Ԫ��Order_S_State����ֵ
	public static WebElement Order_S_State(WebDriver driver) {
	//element = driver.findElement(By.className(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item-selected.ant-select-dropdown-menu-item"));
	element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/ul/li[3]"));	
	return element;
	}
	
	//���嶩�������в�ѯ��ťOrder_SelectԪ�ز�������ֵ
	public static WebElement Order_Select(WebDriver driver){
	element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[6]/button"));
	//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
	return element;
	}
		
		
}
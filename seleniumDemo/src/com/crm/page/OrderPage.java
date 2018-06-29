package com.crm.page;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByCssSelector;

//����CRM��������ҳ�������ҪԪ�ض���
public class OrderPage {
	//��ʼelement����ֵΪnull
	private static WebElement element = null;
	
	//��ҩ���������½�����order_newOrder��������Ԫ��
	//�������˵��������İ�ť
	public static WebElement newOrder_Centre(WebDriver driver){
		element = driver.findElement(By.cssSelector(".ant-menu-submenu-title"));
		return element;
	}
	
	//���嶩�������б�����ҩ��������ť
	public static WebElement newOrder_Management(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"2$Menu\"]/li/span"));//li[2]/ul/li/span
		return element;
	}
	
	//������ҩ��������ҳ���½���ť
	public static WebElement newOrder_newButton(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div/form/div[1]/div[7]/button"));
		return element;
	}
	
	//����Ǽ���ҩҳ��ѡ��ͻ�
	public static WebElement newOrder_addClient(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-select-search__field"));
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[1]/div/div[2]/div/div/div/div"));
		return element;
	}
	
	//����Ǽ���ҩҳ��ѡ��ͻ�
	public static WebElement newOrder_addClient1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[1]/div/div[2]/div/div/div/div/div[2]/div/input"));
		return element;
	}
	
	
	//�����ѯ��ѡ��ͻ�
	public static WebElement newOrder_addClient2(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[7]/div/div/div/ul/li/div"));
		return element;
	}
	
	//�����ռ���ַ
	public static WebElement newOrder_addressee(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[4]/div/div[2]/div/div/div/div/div"));
		return element;
	}	
	
	//���壨����+��ݣ�ѡ���ռ���ַ
	public static WebElement newOrder_addressee1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[8]/div/div/div/ul/li[1]/div"));
		//*[@id='addMedicineRegisterForm']/div[7]/div/div/div/ul/li[1]
		return element;
	}
	
	//���壨ͼ�꣩ѡ���ռ���ַ
	public static WebElement newOrder_menu_addressee1(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='addMedicineRegisterForm']/div[7]/div/div/div/ul/li[1]"));
		return element;
	}
	
	//�����ѯҩƷ
	public static WebElement newOrder_medicine_AddMedicineToOrder_name(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='medicine_AddMedicineToOrder_name']/input"));
		return element;
	}
	
	//�������ҩƷ
	public static WebElement newOrder_medicine_AddMedicineToOrder_name1(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='medicine_AddMedicineToOrder_name']/div/div/div/ul/li/div/div[2]/div"));
		return element;
	}
	
	//�޸Ĺ�������
	public static WebElement newOrder_buyNumber(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='medicine_7013_amount']"));
		return element;
	}
	
	//�޸�Ƶ��
	public static WebElement newOrder_Hz(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='addMedicineRegisterForm']/div[8]/div/div/div/ul/li[1]/div"));
		return element;
	}
	
	//���棨��������������
	public static WebElement newOrder_save(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	//���棨ͼ��+��ݣ���������
	public static WebElement newOrder_Bm_save(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath("//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	//���崴��������ʾ��Ϣ(����)
	public static WebElement newOrder_save_hint(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[1]"));
		//System.out.println(element.toString());
		return element;
	}
	
	//���崴��������ʾ��Ϣ(ͼ��/���)
	public static WebElement newOrder_Bm_save_hint(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[1]"));
		//System.out.println(element.toString());
		return element;
	}	
	
	
	//���崴��������ʾ����������Ϣ��������
	public static WebElement newOrder_save_patient(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]"));
		return element;
	}
	
	//���崴��������ʾ����������Ϣ��ͼ��/��ݣ�
	public static WebElement newOrder_Bm_save_patient(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]"));
		return element;
	}
		
		
	//���崴��������ʾ����������Ϣ��������
	public static WebElement newOrder_save_orderNumber(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]"));
		return element;
	}
	
	//���崴��������ʾ����������Ϣ��ͼ��/��ݣ�
	public static WebElement newOrder_Bm_save_orderNumber(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]"));
		return element;
	}
		
	
	//��ȡ���������ɹ���ʾ������test1��������
	public static String newOrder_save_hint_info1(WebDriver driver){
		String text1 = OrderPage.newOrder_save_hint(driver).getText();
		return text1;
	}
	
	//��ȡ���������ɹ���ʾ������test1��ͼ��/��ݣ�
	public static String newOrder_Bm_save_hint_info1(WebDriver driver){
		String bm_text1 = OrderPage.newOrder_Bm_save_hint(driver).getText();
		return bm_text1;
	}
	
	//��ȡ����������ʾ����������Ϣ������test2��������
	public static String newOrder_save_patient_info2(WebDriver driver){
		String text2 = OrderPage.newOrder_save_patient(driver).getText();
		return text2;
	}
	
	//��ȡ����������ʾ����������Ϣ������test2��ͼ��/��ݣ�
	public static String newOrder_Bm_save_patient_info2(WebDriver driver){
		String bm_text2 = OrderPage.newOrder_Bm_save_patient(driver).getText();
		return bm_text2;
	}
		
	
	//��ȡ����������ʾ����������Ϣ������test3��������
	public static String newOrder_save_orderNumber_info3(WebDriver driver){
		String text3 = OrderPage.newOrder_save_orderNumber(driver).getText();
		return text3;
	}
	
	//��ȡ����������ʾ����������Ϣ������test3��ͼ��/��ݣ�
	public static String newOrder_Bm_save_orderNumber_info3(WebDriver driver){
		String bm_text3 = OrderPage.newOrder_Bm_save_orderNumber(driver).getText();
		return bm_text3;
	}
	
	//���������󷵻ذ�ť��������
	public static WebElement newOrder_return(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	
	//��������������Ǽǰ�ť��������
	public static WebElement newOrder_goOn(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div[2]/div/div[1]/div[3]/div/button[2]"));
		return element;
	}
	
	
	//���������󷵻ذ�ť��ͼ��+��ݣ�
	public static WebElement newOrder_Bm_return(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[4]/div/div[2]/div/div[1]/div[3]/div/button[1]"));
		return element;
	}
	
	//��������������Ǽǰ�ť��ͼ��+��ݣ�
	public static WebElement newOrder_Bm_goOn(WebDriver driver){
		//element = driver.findElement(By.cssSelector(".ant-btn.ant-btn-primary"));
		element = driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[4]/div/div[2]/div/div[1]/div[3]/div/button[2]"));
		return element;
	}
	
	
	//�������½�����order_navigation_Bar��������Ԫ��
	//�����Ϸ������в�ѯ�����
	public static WebElement newOrder_Bar_Name(WebDriver driver){
		//element = driver.findElement(By.xpath(".//*[@id='globalSearchInput']/div/div/div/div/div/div/ul/li/div/input"));
		element = driver.findElement(By.cssSelector(".ant-select-search__field"));
		return element;
	}
	
	//�����Ϸ������в�ѯѡ��
	public static WebElement newOrder_Bar_Name1(WebDriver driver){
		//element = driver.findElement(By.xpath(".//*[@id='app-body']/div[4]/div/div/div/ul/li"));
		element = driver.findElement(By.cssSelector(".ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item"));
		return element;
	}
	
	//����ͻ�������ͼ�갴ť
	public static WebElement newOrder_icon(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='root']/div/div/div/div[3]/div/div/form/div[1]/div[1]/div/div[2]/div/div/div/a/img"));
		//element = driver.findElement(By.cssSelector("element = driver.findElement(By.cssSelector(\".ant-select-search__field\"));"));
		return element;
	}
	
	
	//�������½�����order_menu_Little��������Ԫ��
	//�����Ϸ�������
	public static WebElement menu_Little(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='menuWrapper']/button"));
		return element;
	}
		
	//�����Ϸ������ڵǼ���ҩ��ť
	public static WebElement menu_Order(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/div/div[2]/div/div/div/div[3]/div[2]"));
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
		element = driver.findElement(By.xpath(".//*[@id='app-body']/div[3]/div/div/div/ul/li[2]"));
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
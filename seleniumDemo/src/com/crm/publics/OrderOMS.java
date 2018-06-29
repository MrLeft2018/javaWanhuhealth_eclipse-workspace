package com.crm.publics;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.crm.page.LoginPage;
import com.crm.page.OrderPage;
import com.sun.jna.platform.win32.SetupApi;

public class OrderOMS {
	
	//��ҩ���������½�����
	public static void order_newOrder(WebDriver driver) throws InterruptedException {
		//�����ඩ������
		try {
		OrderPage.newOrder_Centre(driver).click();
		Thread.sleep(1000);
		//�����ҩ��������
		OrderPage.newOrder_Management(driver).click();
		Thread.sleep(1000);
		//��ҩ�����������½�
		OrderPage.newOrder_newButton(driver).click();
		Thread.sleep(2000);
		//��ѯѡ����
		OrderPage.newOrder_addClient(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addClient1(driver).sendKeys("L�Զ�������");
		Thread.sleep(3000);
		OrderPage.newOrder_addClient2(driver).click();
		Thread.sleep(3000);
		//�ռ���ַѡ��
		OrderPage.newOrder_addressee(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addressee1(driver).click();
		Thread.sleep(2000);
		//��ѯ���ҩƷ
		OrderPage.newOrder_medicine_AddMedicineToOrder_name(driver).sendKeys("��̩��");
		//Thread.sleep(2000);
		OrderPage.newOrder_medicine_AddMedicineToOrder_name1(driver).click();
		Thread.sleep(2000);
		//�޸�ҩƷ�÷������͹�������
		OrderPage.newOrder_buyNumber(driver).clear();
		OrderPage.newOrder_buyNumber(driver).sendKeys("2");
		Thread.sleep(2000);
		//���洴������
		OrderPage.newOrder_save(driver).click();
		Thread.sleep(3000);
		//�жϹؼ��֣�����״̬��������Ϣ��������ţ�
		String text1 = OrderPage.newOrder_save_hint_info1(driver);
		String text2 = OrderPage.newOrder_save_patient_info2(driver);
		String text3 = OrderPage.newOrder_save_orderNumber_info3(driver);
		//�����������ϵͳ�󷵻�ֵ
		System.out.println("�Ǽ�״̬��" + text1 + '\n' + "������Ϣ��" + text2 + '\n' + "������ţ�" + text3 + '\n');
		Reporter.log("�Ǽ�״̬��" + text1 + '\n' + "������Ϣ��" + text2 + '\n' + "������ţ�" + text3 + '\n');
		Thread.sleep(2000);
		//���������ɹ��󷵻�
		OrderPage.newOrder_return(driver).click();
		Thread.sleep(2000);
			
		}catch (Exception ex) {
		//����쳣����׼������
		ex.printStackTrace();
		//ʹ��getMessage()��������쳣��Ϣ
		System.out.println("getMessage ������"+ex.getMessage());
		Reporter.log("�Ǽ���ҩʧ��" + '\n' + "���ⶨλ����getMessage����ȷ��δ�ҵ���Ԫ�أ�"+ex.getMessage());
		Thread.sleep(3000);
		//���������ˢ��ҳ�浽ϵͳ��ҳ
		driver.navigate().to("http://demo-crm.wanhuhealth.com");
		Thread.sleep(3000);
		}
		
	}
	
	
	//��������������
	public static void order_navigation_Bar(WebDriver driver) throws InterruptedException {
		//����Ϸ������������ѯ����
		try {
		OrderPage.newOrder_Bar_Name(driver).sendKeys("L�Զ�������");
		Thread.sleep(2000);
		OrderPage.newOrder_Bar_Name1(driver).click();
		Thread.sleep(3000);
		//�����������������ͼ��
		OrderPage.newOrder_icon(driver).click();
		Thread.sleep(4000);
		//�ռ���ַѡ��
		OrderPage.newOrder_addressee(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_menu_addressee1(driver).click();
		Thread.sleep(2000);
		//��ѯ���ҩƷ
		OrderPage.newOrder_medicine_AddMedicineToOrder_name(driver).sendKeys("��̩��");
		Thread.sleep(2000);
		OrderPage.newOrder_medicine_AddMedicineToOrder_name1(driver).click();
		Thread.sleep(2000);
		//�޸�ҩƷ�÷������͹�������
		OrderPage.newOrder_buyNumber(driver).clear();
		OrderPage.newOrder_buyNumber(driver).sendKeys("2");
		Thread.sleep(4000);
		//���洴������
		OrderPage.newOrder_Bm_save(driver).click();
		Thread.sleep(4000);
		//�ؼ��֣�����״̬��������Ϣ��������ţ�
		String bar_text1 = OrderPage.newOrder_Bm_save_hint_info1(driver);
		String bm_text2 = OrderPage.newOrder_Bm_save_patient_info2(driver);
		String bm_text3 = OrderPage.newOrder_Bm_save_orderNumber_info3(driver);
		//�����������ϵͳ�󷵻�ֵ
		System.out.println("�Ǽ�״̬��" + bar_text1 + '\n' + "������Ϣ��" + bm_text2 + '\n' + "������ţ�" + bm_text3 + '\n');
		Reporter.log("�Ǽ�״̬��" + bar_text1 + '\n' + "������Ϣ��" + bm_text2 + '\n' + "������ţ�" + bm_text3 + '\n');
		Thread.sleep(4000);
		//���������ɹ��󷵻�
		OrderPage.newOrder_Bm_return(driver).click();
		Thread.sleep(2000);
		
		}catch (Exception ex) {
		//����쳣����׼������
		ex.printStackTrace();
		//ʹ��getMessage()��������쳣��Ϣ
		System.out.println("getMessage ������"+ex.getMessage());
		Reporter.log("�Ǽ���ҩʧ��" + '\n' + "���ⶨλ����getMessage����ȷ��δ�ҵ���Ԫ�أ�"+ex.getMessage());
		Thread.sleep(3000);
		//���������ˢ��ҳ�浽ϵͳ��ҳ
		driver.navigate().to("http://demo-crm.wanhuhealth.com");
		Thread.sleep(3000);
		}
	}

	//�����ڵǼ���ҩ��������
	public static void order_menu_Little(WebDriver driver) throws InterruptedException {
		// ʵ��������¼�����action
		try {
	    Actions menu_action = new Actions(driver); 
		// �����ͣ�����ڲ�ִ�д洢��Ϊ.perform
		menu_action.clickAndHold(OrderPage.menu_Little(driver)).perform();
		//����Ǽ���ҩ��ť
		OrderPage.menu_Order(driver).click();
		Thread.sleep(2000);
		//��ѯѡ����
		OrderPage.newOrder_addClient(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addClient1(driver).sendKeys("L�Զ�������");
		Thread.sleep(3000);
		OrderPage.newOrder_addClient2(driver).click();
		Thread.sleep(4000);
		//�ռ���ַѡ��
		OrderPage.newOrder_addressee(driver).click();
		Thread.sleep(2000);
		OrderPage.newOrder_addressee1(driver).click();
		Thread.sleep(2000);
		//��ѯ���ҩƷ
		OrderPage.newOrder_medicine_AddMedicineToOrder_name(driver).sendKeys("��̩��");
		Thread.sleep(2000);
		OrderPage.newOrder_medicine_AddMedicineToOrder_name1(driver).click();
		Thread.sleep(2000);
		//�޸�ҩƷ�÷������͹�������
		OrderPage.newOrder_buyNumber(driver).clear();
		OrderPage.newOrder_buyNumber(driver).sendKeys("2");
		Thread.sleep(2000);
		//���洴������
		OrderPage.newOrder_Bm_save(driver).click();
		Thread.sleep(3000);
		//�ؼ��֣�����״̬��������Ϣ��������ţ�
		String menu_text1 = OrderPage.newOrder_Bm_save_hint_info1(driver);
		String bm_text2 = OrderPage.newOrder_Bm_save_patient_info2(driver);
		String bm_text3 = OrderPage.newOrder_Bm_save_orderNumber_info3(driver);
		//�����������ϵͳ�󷵻�ֵ
		System.out.println("�Ǽ�״̬��" + menu_text1 + '\n' + "������Ϣ��" + bm_text2 + '\n' + "������ţ�" + bm_text3 + '\n');
		Reporter.log("�Ǽ�״̬��" + menu_text1 + '\n' + "������Ϣ��" + bm_text2 + '\n' + "������ţ�" + bm_text3 + '\n');
		Thread.sleep(4000);
		//���������ɹ��󷵻�
		OrderPage.newOrder_Bm_return(driver).click();
		Thread.sleep(2000);
		
		}catch (Exception ex) {
		//����쳣����׼������
		ex.printStackTrace();
		//ʹ��getMessage()��������쳣��Ϣ
		System.out.println("getMessage ������"+ex.getMessage());
		Reporter.log("�Ǽ���ҩʧ��" + '\n' + "���ⶨλ����getMessage����ȷ��δ�ҵ���Ԫ�أ�"+ex.getMessage());
		Thread.sleep(3000);
		//���������ˢ��ҳ�浽ϵͳ��ҳ
		driver.navigate().to("http://demo-crm.wanhuhealth.com");
		Thread.sleep(3000);
		}
	}
		
		
	//������ѯ
	public static void order_select(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		OrderPage.newOrder_Centre(driver).click();
		Thread.sleep(1000);
		OrderPage.newOrder_Management(driver).click();
		OrderPage.Order_Selectable(driver).click();
		OrderPage.Order_S_Name(driver).click();
		Thread.sleep(1000);
		OrderPage.Order_QueryText(driver).sendKeys("�Ѿ�ͩ");
		Thread.sleep(1000);
		OrderPage.Order_Select(driver).click();
		Thread.sleep(4000);
		}
		
		
	}

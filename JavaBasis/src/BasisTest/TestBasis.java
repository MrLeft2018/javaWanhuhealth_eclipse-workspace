package BasisTest;
//����input���õİ�
import java.util.Scanner;//System.in��������
import java.util.concurrent.CountDownLatch;

import javax.swing.text.html.HTML;

import java.util.HashMap;//HashMap���������ֵ�
import java.util.Iterator;
import java.util.Map.Entry;

//��������һ������Count��ʹ��public�����ǷǾ�̬���������෽�����ڶ����ڶ����ʼ����new������ܱ�����
	class Count{
	public int add1(int aa,int bb){
		return aa+bb;
	}
	}
	
//���ģ��̳�extends	
	 class AA {
		public int add(int aaa,int bbb){
		return aaa+bbb;
		}
		}

	 class BB extends AA{
	public static int sub(int aaa,int bbb){
		return aaa-bbb;
}
}

	public class TestBasis {
	//��һ��
	public static void start(){
		System.out.println("start=======>");
		}
	public static void end(){
		System.out.println("end=======>");
		}

	//������public static�����Ǿ�̬�����������࣬ʹ������.������ֱ�ӵ��ã�û��static���ε��ǷǾ�̬��Ҫ�����ʼ������������
	public static int add(int aa,int bb){
		return aa+bb;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*����������ַ���string��""���ַ�char��''��
		String name = "����";
		int age = 27;
		char sex = '��';
		/*��println()������print()����,����Ϊprintln()������Ľ�βΪ��һ�����С���printf()�����Ǹ�ʽ���������, һ��������
		��׼����豸���涨��ʽ�����Ϣ�� ��printf��ʹ��\n����
		
		System.out.printf("name: %s ; age: %d ; sex: %c\n" ,name,age,sex);
		System.out.println("name:"+name+";age:"+age+";sex:"+sex);
		
		*/
		
		
		/*if else �ж�С����
				int a=1,b=2;
				if (a>b) {
					System.out.printf("%d big",a);
				}
				else 
				{
					System.out.printf("%d big", b);
				}
		*/
				
		/*forѭ��
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int i=1;i<=5;i++){
			for(int j=5-i;j>0;j--){
			System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
			System.out.print("*");
			}
			System.out.println("");
			}
		*/
			
		
		/*��������scanner�� �Ӷ�����ʹ��System.in�������벢��ӡ����
		Scanner input = new Scanner(System.in);
		System.out.print("���ո��������:"+input.nextLine());
		*/
		
		/*���������Լ������д洢�ַ���
		int[] data = new int[5];
		for(int i = 0;i < 5;i++) {
			data[i] = i;
			System.out.println(data[i]);
		}
		
		String[] dataS = new String[5];
		dataS[0] = "Ħ��";
		dataS[1] = "С��";
		dataS[2] = "С��";
		dataS[3] = "����";
		dataS[4] = "�ϰ�";
		for(int i = 0;i<5;i++) {
			System.out.println(dataS[i]);
		}
		
		String[] fruits = {"bananas", "apples", "pears", "oranges"};
		for(int i=0;i<fruits.length;i++){
		System.out.println(fruits[i]);
		}
		*/
		
		/*�ֵ䡰��- ֵ�ԡ�(Key-Value Pair)�ļ��ϡ�{һ��key ��Ӧһ��value}��ͨ������HashMap���ʵ���ֵ��������ݵĴ��
		HashMap<String, String> hm = new HashMap<String, String>();
		//����ֵ�����
		hm.put("username", "password");
		hm.put("Jim","1155689");
		hm.put("Jane","1255669");
		hm.put("Kevin","1165669");
		
		//��hm.containsKey��������key �Ƿ����password,����ֵΪture/false
		System.out.println(hm.containsKey("password"));
		System.out.println("==========>");
		
		//��hm.get�������Ի�ȡkey ����Ӧ��vlaueֵ
		System.out.println(hm.get("Jim"));
		System.out.println("==========>");
		
		//��hm.entrySet�������Ի�ȡ�����ֵ�����
		System.out.println(hm.entrySet());
		System.out.println("=========>");
		
		//��Iterator<?>��hm.entrySet().iterator()��.hasNext()�����ֱ��ȡkey��ֵ����value��ֵ��
		Iterator<?> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("========>");
		
		
		//��Iterator<String>��hm.keySet().iterator()��.hasNext()�����ֱ��ȡkey��ֵ����value��ֵ
		Iterator<String> it3 = hm.keySet().iterator();
		while (it3.hasNext()) {
			//����ֵ��key(username)
			String username = (String)it3.next();
			System.out.println(username);
			//����ֵ��value(�ڵ�)
			String password = hm.get(username);
			System.out.println(password);
			
		}
		
		*/
		
		/*������main()�ⶨ��ķ�����ֱ�ӵ��ã�һ��
		start();
		System.out.println("run-----");
		end();
		*/
		
		/*���÷����п�����������������㷽ʽ�ͷ���ֵ������
		int sum = add(4,7);
		System.out.println(sum);
		*/

		/*
		//�ٵ���ʹ��Count����࣬������new��ʼ��������
		Count j = new Count();
		//��new���޷����õ�Count���add1()�����ġ�
		System.out.println(j.add1(2,5));
		*/	
		
		//Java����extends�ؼ���������ļ̳С����ģ�
		//ʵ����B ��һ������j
		BB j = new BB();
		//��ȻB ����û��add()������B ��̳���A �࣬A ����add()������
		int resul = j.add(5, 9);
		System.out.println(resul);

	}

}

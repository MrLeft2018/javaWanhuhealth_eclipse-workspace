package BasisTest;
//输入input调用的包
import java.util.Scanner;//System.in方法输入
import java.util.concurrent.CountDownLatch;

import javax.swing.text.html.HTML;

import java.util.HashMap;//HashMap方法定义字典
import java.util.Iterator;
import java.util.Map.Entry;

//（三）定一个新类Count，使用public修饰是非静态方法，该类方法属于对象，在对象初始化（new）后才能被调用
	class Count{
	public int add1(int aa,int bb){
		return aa+bb;
	}
	}
	
//（四）继承extends	
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
	//（一）
	public static void start(){
		System.out.println("start=======>");
		}
	public static void end(){
		System.out.println("end=======>");
		}

	//（二）public static修饰是静态方法，属于类，使用类名.方法名直接调用，没有static修饰的是非静态需要对象初始化见（三）。
	public static int add(int aa,int bb){
		return aa+bb;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*输出定义是字符串string用""，字符char用''；
		String name = "刘阳";
		int age = 27;
		char sex = '男';
		/*用println()而不是print()方法,是因为println()在输出的结尾为加一个换行。而printf()函数是格式化输出函数, 一般用于向
		标准输出设备按规定格式输出信息。 再printf中使用\n换行
		
		System.out.printf("name: %s ; age: %d ; sex: %c\n" ,name,age,sex);
		System.out.println("name:"+name+";age:"+age+";sex:"+sex);
		
		*/
		
		
		/*if else 判断小例子
				int a=1,b=2;
				if (a>b) {
					System.out.printf("%d big",a);
				}
				else 
				{
					System.out.printf("%d big", b);
				}
		*/
				
		/*for循环
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
			
		
		/*输入引用scanner包 从而定义使用System.in方法输入并打印出来
		Scanner input = new Scanner(System.in);
		System.out.print("您刚刚输入的是:"+input.nextLine());
		*/
		
		/*定义数组以及数组中存储字符串
		int[] data = new int[5];
		for(int i = 0;i < 5;i++) {
			data[i] = i;
			System.out.println(data[i]);
		}
		
		String[] dataS = new String[5];
		dataS[0] = "摩拜";
		dataS[1] = "小黄";
		dataS[2] = "小蓝";
		dataS[3] = "酷奇";
		dataS[4] = "迪拜";
		for(int i = 0;i<5;i++) {
			System.out.println(dataS[i]);
		}
		
		String[] fruits = {"bananas", "apples", "pears", "oranges"};
		for(int i=0;i<fruits.length;i++){
		System.out.println(fruits[i]);
		}
		*/
		
		/*字典“键- 值对”(Key-Value Pair)的集合。{一个key 对应一个value}，通过引用HashMap类包实现字典类型数据的存放
		HashMap<String, String> hm = new HashMap<String, String>();
		//点击字典数据
		hm.put("username", "password");
		hm.put("Jim","1155689");
		hm.put("Jane","1255669");
		hm.put("Kevin","1165669");
		
		//用hm.containsKey方法测试key 是否包含password,返回值为ture/false
		System.out.println(hm.containsKey("password"));
		System.out.println("==========>");
		
		//用hm.get方法测试获取key 所对应的vlaue值
		System.out.println(hm.get("Jim"));
		System.out.println("==========>");
		
		//用hm.entrySet方法测试获取整个字典数据
		System.out.println(hm.entrySet());
		System.out.println("=========>");
		
		//用Iterator<?>和hm.entrySet().iterator()和.hasNext()方法分别获取key的值，和value的值。
		Iterator<?> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("========>");
		
		
		//用Iterator<String>和hm.keySet().iterator()及.hasNext()方法分别获取key的值，和value的值
		Iterator<String> it3 = hm.keySet().iterator();
		while (it3.hasNext()) {
			//获得字典的key(username)
			String username = (String)it3.next();
			System.out.println(username);
			//获得字典的value(节点)
			String password = hm.get(username);
			System.out.println(password);
			
		}
		
		*/
		
		/*主方法main()外定义的方法可直接调用（一）
		start();
		System.out.println("run-----");
		end();
		*/
		
		/*调用方法中可设置输入参数、计算方式和返回值（二）
		int sum = add(4,7);
		System.out.println(sum);
		*/

		/*
		//再调用使用Count这个类，必须先new初始化（三）
		Count j = new Count();
		//不new是无法调用到Count类的add1()方法的。
		System.out.println(j.add1(2,5));
		*/	
		
		//Java中用extends关键字来做类的继承。（四）
		//实例化B 类一个对象j
		BB j = new BB();
		//虽然B 类中没有add()方法，B 类继承了A 类，A 类有add()方法。
		int resul = j.add(5, 9);
		System.out.println(resul);

	}

}

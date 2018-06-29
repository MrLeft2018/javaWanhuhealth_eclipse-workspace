package BasisTest;

public class C {

	public static void main(String[] args){
		//实例化B 类一个对象j
		B j = new B();
		//虽然B 类中没有add()方法，B 类继承了A 类，A 类有add()方法。
		int resul = j.add(5, 6);
		System.out.println(resul);
		}

}

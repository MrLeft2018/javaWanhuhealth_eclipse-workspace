package CaseImooc;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//利用多态的方法指向对象，都用父类的类名称,并调用抽象类（父类）中的方法
		APerson p = new Chinese();
		APerson p2 = new American();
		
		p.say();
		p2.say();
	}

}

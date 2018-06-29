package lyImooc;

import org.apache.bcel.generic.IF_ACMPEQ;

//针对Animal和Dog的测试类
public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//同样一个类型的引用我可以指向本类也可以指向子类，但不能用一个子类的引用指向一个父类的引用。
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		//Dog obj = new Animal();错误的子类不能指向父类
		Animal obj3 = new Cat();
		//方法的多态
		obj1.eat();
		obj2.eat();
		obj3.eat();
		//不能调用子类独有的方法obj2.watchDog();
*/
		Dog dog = new Dog();//创建对象dog
		Animal animal = dog;//用一个父类引用指向子类对象，相当于做了一个自动类型提升（向上类型转换）
		if(animal instanceof Dog) {
			Dog dog2 = (Dog)animal;//向下类型转换，强制转换(子类名称)		
		}else {
			System.out.println("无法进行类型转换 转换成Dog类型");
		}
		if(animal instanceof Cat) {//利用in身tanceof判断类型中是否含有后者类型元素，若有可以转换否则不可转换
		Cat cat = (Cat)animal;//编译时是Cat类型，但是运行时确实Dog类型
	}else {
		System.out.println("无法进行类型转换 转换成Cat类型");
	}

}
}

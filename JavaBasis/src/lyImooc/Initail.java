package lyImooc;

import org.apache.bcel.generic.IF_ACMPEQ;

//���Animal��Dog�Ĳ�����
public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//ͬ��һ�����͵������ҿ���ָ����Ҳ����ָ�����࣬��������һ�����������ָ��һ����������á�
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();
		//Dog obj = new Animal();��������಻��ָ����
		Animal obj3 = new Cat();
		//�����Ķ�̬
		obj1.eat();
		obj2.eat();
		obj3.eat();
		//���ܵ���������еķ���obj2.watchDog();
*/
		Dog dog = new Dog();//��������dog
		Animal animal = dog;//��һ����������ָ����������൱������һ���Զ�������������������ת����
		if(animal instanceof Dog) {
			Dog dog2 = (Dog)animal;//��������ת����ǿ��ת��(��������)		
		}else {
			System.out.println("�޷���������ת�� ת����Dog����");
		}
		if(animal instanceof Cat) {//����in��tanceof�ж��������Ƿ��к�������Ԫ�أ����п���ת�����򲻿�ת��
		Cat cat = (Cat)animal;//����ʱ��Cat���ͣ���������ʱȷʵDog����
	}else {
		System.out.println("�޷���������ת�� ת����Cat����");
	}

}
}

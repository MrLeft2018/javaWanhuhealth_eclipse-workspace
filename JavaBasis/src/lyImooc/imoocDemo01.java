package lyImooc;
import java.util.Scanner;//Scanner工具类来获取用户输入
/*
 * 功能：为指定的学生成绩加分，直至分数大于60分。
 * 输出加分前和加分后的成绩，以及加了几次分数。
 * 步骤：
 * 1、定义一个变量，用来保存加分次数count
 * 2、使用循环为成绩加分
 * 3、每次执行循环加分操作，每次加1分，并统计积分次数
 * 
 * 使用Scanner工具类来获取用户输入的成绩信息
 * Scanner类位于java.util包中，使用时需要导入此包
 * 步骤：
 * 1、导入java.util.Scanner的包
 * 2、创建Scanner对象
 * 3、接受输入的值并保存熬score中然后执行后续步骤
 */
public class imoocDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//创建Scanner对象
		System.out.print("请输入学生的成绩信息： ");
		
		int score = input.nextInt();//获取用户输入的成绩并保存保存在变量scor中
		//int score=53;//初始学生加分前成绩
		int count=0;//初始加分次数
		System.out.println("加分前成绩： "+score);
		
		while(score<60){//只要学生分数小于60，就循环自增
			score++;//每次增加一分
			count++;//统计增加次数
		}
		
		System.out.println("加分后成绩："+score);
		System.out.println("共加分"+count+"次！");
	}

}

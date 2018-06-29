package lyImooc;
import java.util.Scanner;//Scanner工具类来获取用户输入
/*
 * 功能：实现接受三个班，各四名学生的成绩信息，然后计算出每个班学生的平局分
 * 知识点：两层循环、外层循环控制班级数量，内层循环控制每个班的学生数量
 */

public class imoocDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int classNum = 3;//班级数量
		int stuNum = 4;//学生数量
		double sum = 0;//总分
		double avg = 0;//平局分
		Scanner input = new Scanner(System.in);//创建Scanner对象
		for(int i=1;i<=classNum;i++) {//外层循环控制班级数量
			sum = 0;//执行第二次时将上次内部循环的成绩总和归零
			System.out.println("**请输入第"+i+"个班的成绩**");
			for(int j=1;j<=stuNum;j++) {//内层循环控制学生数量
				System.out.println("请输入第"+j+"个学生的成绩: ");
				int score = input.nextInt();//获取输入值的成绩
				sum = sum + score;//计算成绩累加和
			}
			avg = sum/stuNum;//计算平局分
			System.out.println("第"+i+"班级的学生平局分是"+avg);
		}
		
	}

}

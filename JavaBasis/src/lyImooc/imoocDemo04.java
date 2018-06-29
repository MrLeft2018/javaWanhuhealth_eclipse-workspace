package lyImooc;
import java.util.Arrays;

/*
 * 任务
一、 定义一个带参带返回值的方法，实现输出随机数数组
提示：
 1、 定义一个带参带返回值的方法，通过参数传入数组的长度，返回值为赋值后的数组
 2、 创建指定长度的整型数组
 3、 使用 for 循环遍历数组，通过 Math.random( ) 生成随机并给数组成员赋值
 4、 使用 return 返回赋值后的数组
二、 完成 main 方法
提示：
 1、 调用自定义方法，保存方法执行后返回的数组
 2、 使用 Arrays.toString( ) 将数组转换为字符串并输出，注意导入 java.util.Arrays;
 */

public class imoocDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建对象，对象名为demo04
		imoocDemo04 demo04 = new imoocDemo04();
		// 调用方法并将返回值保存在变量中取8位
		int[] nums = demo04.getArray(10);
		// 将数组转换为字符串并输出
		System.out.println(Arrays.toString(nums));
	}
	/*
	 * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
	 * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
	 */
	
	public int[] getArray(int length) {
		// 定义指定长度的整型数组
		int[] nums = new int[length];
		// 循环遍历数组赋值
		for(int i=0;i < nums.length;i++) {
		// 产生一个100以内的随机数，并赋值给数组的每个成员
			nums[i] = (int)(Math.random()*100);
		}
			
		return nums;// 返回赋值后的数组
		
		
	}

}

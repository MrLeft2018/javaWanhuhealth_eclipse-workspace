package lyImooc;
import java.util.Arrays;

/*
 * ����
һ�� ����һ�����δ�����ֵ�ķ�����ʵ��������������
��ʾ��
 1�� ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ�����ֵΪ��ֵ�������
 2�� ����ָ�����ȵ���������
 3�� ʹ�� for ѭ���������飬ͨ�� Math.random( ) ����������������Ա��ֵ
 4�� ʹ�� return ���ظ�ֵ�������
���� ��� main ����
��ʾ��
 1�� �����Զ��巽�������淽��ִ�к󷵻ص�����
 2�� ʹ�� Arrays.toString( ) ������ת��Ϊ�ַ����������ע�⵼�� java.util.Arrays;
 */

public class imoocDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������󣬶�����Ϊdemo04
		imoocDemo04 demo04 = new imoocDemo04();
		// ���÷�����������ֵ�����ڱ�����ȡ8λ
		int[] nums = demo04.getArray(10);
		// ������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(nums));
	}
	/*
	 * ���ܣ�����ָ�����ȵ�int�����飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ
	 * ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ����ظ�ֵ�������
	 */
	
	public int[] getArray(int length) {
		// ����ָ�����ȵ���������
		int[] nums = new int[length];
		// ѭ���������鸳ֵ
		for(int i=0;i < nums.length;i++) {
		// ����һ��100���ڵ������������ֵ�������ÿ����Ա
			nums[i] = (int)(Math.random()*100);
		}
			
		return nums;// ���ظ�ֵ�������
		
		
	}

}

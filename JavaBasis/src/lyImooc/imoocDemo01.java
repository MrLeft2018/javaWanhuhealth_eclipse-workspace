package lyImooc;
import java.util.Scanner;//Scanner����������ȡ�û�����
/*
 * ���ܣ�Ϊָ����ѧ���ɼ��ӷ֣�ֱ����������60�֡�
 * ����ӷ�ǰ�ͼӷֺ�ĳɼ����Լ����˼��η�����
 * ���裺
 * 1������һ����������������ӷִ���count
 * 2��ʹ��ѭ��Ϊ�ɼ��ӷ�
 * 3��ÿ��ִ��ѭ���ӷֲ�����ÿ�μ�1�֣���ͳ�ƻ��ִ���
 * 
 * ʹ��Scanner����������ȡ�û�����ĳɼ���Ϣ
 * Scanner��λ��java.util���У�ʹ��ʱ��Ҫ����˰�
 * ���裺
 * 1������java.util.Scanner�İ�
 * 2������Scanner����
 * 3�����������ֵ�����氾score��Ȼ��ִ�к�������
 */
public class imoocDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//����Scanner����
		System.out.print("������ѧ���ĳɼ���Ϣ�� ");
		
		int score = input.nextInt();//��ȡ�û�����ĳɼ������汣���ڱ���scor��
		//int score=53;//��ʼѧ���ӷ�ǰ�ɼ�
		int count=0;//��ʼ�ӷִ���
		System.out.println("�ӷ�ǰ�ɼ��� "+score);
		
		while(score<60){//ֻҪѧ������С��60����ѭ������
			score++;//ÿ������һ��
			count++;//ͳ�����Ӵ���
		}
		
		System.out.println("�ӷֺ�ɼ���"+score);
		System.out.println("���ӷ�"+count+"�Σ�");
	}

}

package lyImooc;
import java.util.Scanner;//Scanner����������ȡ�û�����
/*
 * ���ܣ�ʵ�ֽ��������࣬������ѧ���ĳɼ���Ϣ��Ȼ������ÿ����ѧ����ƽ�ַ�
 * ֪ʶ�㣺����ѭ�������ѭ�����ư༶�������ڲ�ѭ������ÿ�����ѧ������
 */

public class imoocDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int classNum = 3;//�༶����
		int stuNum = 4;//ѧ������
		double sum = 0;//�ܷ�
		double avg = 0;//ƽ�ַ�
		Scanner input = new Scanner(System.in);//����Scanner����
		for(int i=1;i<=classNum;i++) {//���ѭ�����ư༶����
			sum = 0;//ִ�еڶ���ʱ���ϴ��ڲ�ѭ���ĳɼ��ܺ͹���
			System.out.println("**�������"+i+"����ĳɼ�**");
			for(int j=1;j<=stuNum;j++) {//�ڲ�ѭ������ѧ������
				System.out.println("�������"+j+"��ѧ���ĳɼ�: ");
				int score = input.nextInt();//��ȡ����ֵ�ĳɼ�
				sum = sum + score;//����ɼ��ۼӺ�
			}
			avg = sum/stuNum;//����ƽ�ַ�
			System.out.println("��"+i+"�༶��ѧ��ƽ�ַ���"+avg);
		}
		
	}

}

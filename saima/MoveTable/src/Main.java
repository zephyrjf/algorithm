/*
 * СA��һ�Ű뾶Ϊr��Բ����������λ��(x,y)�����������Բ���������Ƶ�(x1, y1)��
 * ÿ���ƶ�һ����СA������Բ���߽��Ϲ̶�һ���㣬Ȼ��Բ�����������ת�� ��������Ҫ�������ܰ�Բ���Ƶ�Ŀ��λ�ã�
 * */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double d = Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
		System.out.println((int)Math.ceil(d / 2 / r));
	}
}

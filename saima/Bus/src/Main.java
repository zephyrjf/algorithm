/*
 * һ������������n��վ�㣬�˿ʹ�ǰ���ϳ����Ӻ����³���
 * ����ͳ�����ڵ�i��վ���³�����a[i]���Լ��ϳ�����b[i]��
 * �ʹ���������ʱ��������ж��ٳ˿�
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int cur = 0;
		for (int i = 0; i < n; i++) {
			cur = cur - sc.nextInt() + sc.nextInt();
			max = max > cur ? max : cur;
		}
		System.out.println(max);
	}
}

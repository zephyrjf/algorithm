/*
 * XѧУ�����֯��һ������̤������Y��˾������������ѧ����
 * ��βμӻ���ܹ���n���༶����i���ܹ���ai��ѧ����ÿ�������˳�����Ϊm������m>a1, a2, ..., an��
 * �˳�ʱ���밴�հ༶����˳����г˳������ܵ����༶˳�����ƴ����
 * Ϊ��֤ͬһ���༶��ѧ����ͬһ�����ϣ������ǰ����װ����һ���༶����һ���༶����ͬѧ�޷�װ�£���ô��ǰ������ʹ����һ������
 * ��������Ҫ�����������ܰ�����ѧ�����ꣿ
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] stu = new int[n];
		for (int i = 0; i < n; i++) {
			stu[i] = sc.nextInt();
		}
		
		int count = 0;
		int cur = 0;
		int tmp;
		while(cur < n) {
			count++;
			tmp = stu[cur++];
			while(cur < n && tmp + stu[cur] <= m) {
				tmp += stu[cur];
				cur++;
			}
		}
		System.out.println(count);
	}
}

/*
 * С��������Ҫ����һ��ǡ��Ϊһ������������n��������Ҫ����������ﵽ��һ�Կɣ�����ʫ�衭��
 * ���ṹ��m�ֳ��ȵĶ̾䣨���������ס�ʫ�衱���г���Ϊ1��7�Ķ̾䣩������ÿ�ֳ��ȵĶ̾����ķѵ�ʱ������ͬ�ġ�
 * ���������æ���£�С��������Ҫ����ʱ�䣬���ܴ���Լ���Ŀ���أ����û�а취ʵ�֣������"It is not true!"��û�����ţ���
 * 
 * ��һ��һ������n����ʾС���봴��ʫ��������ļ��ϴ�С��
 * ������n�У����е�i��Ϊһ����a[i]����ʾ����ʫ�������a[i]���֡�
 * �ڶ���һ������m����ʾС�����Թ����m�ֲ�ͬ���ȶ̾�ĸ�����
 * ������m�У����е�i��Ϊ��������b[i],c[i]������b[i]��ʾС�����Դ���������Ϊb[i]�Ķ̾䣬��Ӧ��c[i]��ʾ�������ֳ��ȶ̾������ĵ�ʱ�䡣
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int min = 0x8fffffff;
		
	}
}

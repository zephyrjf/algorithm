/*
 * С���ļ�ס�ڵ�n�㣬������ѡ��ӵ�����¥������ֻ��С��һ���˻��õ��ݣ�������¥����¥��
 * ��ǰ����ͣ�ڵ�m�㣬������ӵ����µ���1�㣬��Ҫ�������ȵ�����һ��->����->����->�����ٵ����һ��->���ţ����Ŀ���ʱ��ҲҪ�������ڣ���
 * С���ļ���¥��n����ǰ����ͣ�ڵ�¥��m��
 * �Լ�����ÿ����һ��¥��ʱ��t1������ʱ��t2������ʱ��t3������С��ÿ��һ��¥��ʱ��t4��
 * �����С������һ�£�����쵽���1���ʱ�䡣
 * */
import java.util.*;
public class Main {
	private static long t1, t2, t3, t4;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	long n = sc.nextLong();
      	long m = sc.nextLong();
      	t1 = sc.nextLong();
      	t2 = sc.nextLong();
      	t3 = sc.nextLong();
      	t4 = sc.nextLong();
      	long result1 = t4 * (n-1);
      	long result2 = (Math.abs(n-m) + n - 1) * t1 + 2 * t2 + t3;
      	result1 = result1 < result2 ? result1 : result2;
      	System.out.println(result1);
	}
}

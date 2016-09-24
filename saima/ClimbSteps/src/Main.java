import java.util.Scanner;

/*
 * ��Ŀ����
 * ��һ¥�ݹ�m�����տ�ʼʱ���ڵ�һ������ÿ��ֻ�ܿ���һ���������Ҫ���ϵ�m�������ж����߷���
 * ע���涨��һ����һ����0���߷���
 * 
 * �����������Ȱ���һ������n(1<=n<=100)����ʾ����ʵ���ĸ�����Ȼ����n�����ݣ�ÿ�а���һ������m����1<=m<=40), ��ʾ¥�ݵļ�����
 * 
 * ����ÿ������ʵ�����������ͬ�߷���������
 * */

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		while (--n >= 0) {
			m = sc.nextInt();
			System.out.println(climbSteps(m));
		}
	}

	private static int climbSteps(int m) {
		if (m == 1) {
			return 0;
		} else if (m == 2) {
			return 1;
		} else if (m == 3) {
			return 2;
		} else {
			return climbSteps(m-1) + climbSteps(m-2);
		}
	}
}

/*
 * recursion
 * */

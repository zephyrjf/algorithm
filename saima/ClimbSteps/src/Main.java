import java.util.Scanner;

/*
 * 题目描述
 * 有一楼梯共m级，刚开始时你在第一级，若每次只能跨上一级或二级，要走上第m级，共有多少走法？
 * 注：规定从一级到一级有0种走法。
 * 
 * 输入数据首先包含一个整数n(1<=n<=100)，表示测试实例的个数，然后是n行数据，每行包含一个整数m，（1<=m<=40), 表示楼梯的级数。
 * 
 * 对于每个测试实例，请输出不同走法的数量。
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

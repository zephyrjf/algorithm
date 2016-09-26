/*
 * 一个公交车经过n个站点，乘客从前门上车，从后门下车。
 * 现在统计了在第i个站，下车人数a[i]，以及上车人数b[i]。
 * 问公交车运行时候车上最多有多少乘客
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

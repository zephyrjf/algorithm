/*
 * 某校计算机专业今年录取研究生的要求是：政治、英语每门课成绩不低于60分，数学和专业课不低于90分，总成绩不低于310分。
 * 并且规定：在满足单科以及总成绩最低要求的基础上，350分以上（含350分）为公费（Gongfei），310分~349分为自费(Zifei)。
 * 请编程判断考生的录取情况
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, b, c, d;
		while (n-- > 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			if (checkGrade(a, 60) && checkGrade(b, 60) && checkGrade(c, 90) && checkGrade(d, 90) && checkTotal(a+b+c+d)) {}
			else {
				System.out.println("Fail");
			}
		}
	}
	private static boolean checkGrade(int grade, int atLeast) {
		if (grade < atLeast) {
			return false;
		} else {
			return true;
		}
	}
	
	private static boolean checkTotal(int total) {
		if (total >= 350) {
			System.out.println("Gongfei");
			return true;
		} else if (total >= 310) {
			System.out.println("Zifei");
			return true;
		}
		return false;
	}
}

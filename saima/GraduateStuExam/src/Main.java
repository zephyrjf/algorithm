/*
 * ĳУ�����רҵ����¼ȡ�о�����Ҫ���ǣ����Ρ�Ӣ��ÿ�ſγɼ�������60�֣���ѧ��רҵ�β�����90�֣��ܳɼ�������310�֡�
 * ���ҹ涨�������㵥���Լ��ܳɼ����Ҫ��Ļ����ϣ�350�����ϣ���350�֣�Ϊ���ѣ�Gongfei����310��~349��Ϊ�Է�(Zifei)��
 * �����жϿ�����¼ȡ���
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

/*
 * Bob��Alice�и�Լ�ᣬһ����Bob�ʹӵ�(0,0)������ǰ��Լ��ص�(a,b)��
 * Bobû��һ�㷽��У������ÿ�ζ�����������������ĸ�������һ����
 * �����֮�����Bob��ǰ��(x,y)����ô��һ�����п��ܵ���(x+1,y), (x-1,y), (x,y+1), (x,y-1)��
 * ����Ȼ����������Ŀ�ĵص�ʱ���Ѿ������ˣ�Alice������ȥ���ڶ��죬Alice����BobΪʲô�������ӣ�Bob˵�����컨��s��������Լ��ص㡣Alice����Bob�ǲ���˵���ˡ�
 * ���ܷ������֤һ�£�
 * 
 * ������������a,b,s
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = sc.nextInt();
		a = a < 0 ? -a : a;
		b = b < 0 ? -b : b;
		int e = s - a - b;
		if (e >= 0 && e % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

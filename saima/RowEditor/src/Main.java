/*
 * ��һ����һ������T��������T�����ݡ�
 * ÿ�����ݵĿ�ʼʱһ���ַ������ַ�������С��100��#���� @���
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			String input = sc.next();
			char[] cinput = new char[input.length()];
			int curLen = 0;
			for (int i = 0; i < cinput.length; i++) {
				if (input.charAt(i) == '#') {
					if (curLen > 0) {
						curLen--;
					}
				} else if (input.charAt(i) == '@') {
					curLen = 0;
				} else {
					cinput[curLen++] = input.charAt(i);
				}
			}
			System.out.println(String.copyValueOf(cinput, 0, curLen));
		}
	}
}

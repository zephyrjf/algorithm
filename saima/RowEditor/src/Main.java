/*
 * 第一行是一个整数T，代表有T组数据。
 * 每组数据的开始时一个字符串，字符串长度小于100，#回退 @清空
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

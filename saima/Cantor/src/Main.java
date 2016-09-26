/*
 * 现在有"abcdefghijkl”12个字符，将其所有的排列中按字典序排列，给出任意一种排列，说出这个排列在所有的排列中是第几小的？
 * */

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] fac = new int[12];
		fac[0] = 1;
		for (int i = 1; i <= 11; i++) {
			fac[i] = fac[i-1] * i;
		}
		ArrayList<Character> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tmp;
		while(n-- > 0) {
			list.clear();
			int result = 1;
			tmp = sc.next();
			char c;
			for (int i = 0; i < 12; i++) {
				c = tmp.charAt(i);
				int count = 0;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) < c) {
						count++;
					}
				}
				count = c - 'a' - count;
				result += count * fac[11-i];
				list.add(c);
			}
			System.out.println(result);
		}
	}
}

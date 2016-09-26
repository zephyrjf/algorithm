/*
 * 给定一个字符串，问是否能够通过添加一个字母将其变成“回文串”。 
 * “回文串”是指正着和反着读都一样的字符串。如：”aa”,”bob”,”testset”是回文串，”alice”,”time”都不是回文串。
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char[] str = sc.nextLine().toCharArray();
			boolean once = false;
			int i = 0, j = str.length - 1;
			while (i < str.length && j >= 0 && i < j) {
				if (str[i] == str[j]) {
					i++;
					j--;
					continue;
				}
				if (!once) {
					once = true;
					if (str[i+1] == str[j]) {
						i++;
					} else if (str[i] == str[j-1]) {
						j--;
					} else {
						break;
					}
				}
			}
			if (i >= j) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
	}
}

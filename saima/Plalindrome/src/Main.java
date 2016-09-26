/*
 * ����һ���ַ��������Ƿ��ܹ�ͨ�����һ����ĸ�����ɡ����Ĵ����� 
 * �����Ĵ�����ָ���źͷ��Ŷ���һ�����ַ������磺��aa��,��bob��,��testset���ǻ��Ĵ�����alice��,��time�������ǻ��Ĵ���
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

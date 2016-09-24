/*
 * ��������Ī����֮�󣬻ع鵽�����ǵ����⣬Լ�¶��˵�δ����
 * ˵��Լ�¶��˵�δ������Ĭ�������������һ��Լ�¶����ԣ���Լ�¶��˵���ʷ��ÿ���׶ζ���һ���ַ���������(������д�ַ�,�������ո�)��
 * Ȼ������ַ���ת��Ϊһ��01����ת���������������ַ��������ĸ�������֣�����ַ���Ϊ1,������Ϊ0��
 * Ȼ�����01���ͺ�Ĭ����۲��ǿյõ���01�����Ƚϣ��õ�һ�������ʡ�������Խ��,��Լ�¶���δ��Խ������
 * ����:������Ϊ���٣�
 * 
 * ÿ����������Ϊ���У���һ��Ϊ�й�Լ�¶�����ʷ���ַ������ڶ����Ǻ�Ĭ����۲��ǿյõ����ַ�����(�����ַ����ĳ������,�ַ������Ȳ�С��1�Ҳ�����1000��)
 * 
 * */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String history = sc.nextLine();
		String str = sc.nextLine();
		int correct = 0;
		char cur = '0';
		for (int i = 0; i < history.length(); i++) {
			cur = history.charAt(i);
			if ((cur >= 'a' && cur <= 'z') || (cur >= 'A' && cur <= 'Z') || (cur >= '0' && cur <= '9')) {
				if (str.charAt(i) == '1') {
					correct++;
				}
			} else {
				if (str.charAt(i) == '0') {
					correct++;
				}
			}
		}
		System.out.println(String.format("%.2f", ((double) correct * 100) / history.length()) + '%');
	}
}

/*
 *С�����о�С����Ҫ���һ�����ݱ���봫������⣬���Խ�������ַ������±��봫�䡣
 *���еı������Ϊ����Ҫ��������ݲ�ֳ��ֽ����飬3�ֽ�Ϊһ�鰴˳������Ϊ24 λ���ٽ�24λ�ֳ�ÿ��6λ��4�����ݡ�Ȼ����ÿ�����ǰ��ǰ������0λ�ճ�һ���ֽڡ�
 *ͨ�����ַ�ʽ��3���ֽڵ��������±���Ϊ4���ֽڡ�Ȼ����4���ֽ���ÿ���ֽڵ�ֵ��Ϊ����ͨ�����ķ�ʽ�滻Ϊ��Ӧ���ַ���
 *��ѯ����а���64���ַ�������Ϊ��0��-��9������+������-������a��-��z���Լ���A��-��Z����
 *��Ҫ����������ֽ�������3���������������һ��������1��2��0�����ڱ�����ɺ��ڽ�β�����ͬ��Ŀ�� ��=����
 *����С�����յ�������ϵ����ݣ���Ҫ�ָ�����ǰ�����ݡ�С�����֣����ڴ��ڴ���ضϵĿ����ԣ��������н��յ����ݶ����Խ��롣С��ϣ�����ܰ�æ��д���� 
 * */
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//����
		HashMap<Character, Integer> table = new HashMap<>();
		int index = 0;
		for (char c = '0'; c <= '9'; c++) {
			table.put(c, index++);
		}
		table.put('+', index++);
		table.put('-', index++);
		for (char c = 'a'; c <= 'z'; c++) {
			table.put(c, index++);
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			table.put(c, index++);
		}
		//��ʼ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DD:
		while (n-- > 0) {
			String code = sc.next();
			StringBuilder decode = new StringBuilder();
			if (code.length() % 4 != 0) {
				System.out.println("Invalid");
			} else {
				for (int i = 0; i < code.length(); i += 4) {
					int subDecode = 0;
					for (int j = 0; j < 4; j++) {
						subDecode <<= 6;
						if (code.charAt(i+j) != '=') {
							subDecode |= table.get(code.charAt(i+j));
						}
					}
					char c;
					for (int j = 2; j >= 0; j--) {
						int tmp = (char)(((subDecode >> (8 * j)) & 0xff));
						if (tmp != 0) {
							if (tmp < 32 || tmp > 126) {
								System.out.println("Invalid");
								continue DD;
							}
							decode.append((char)tmp);
						}
					}
				}
			}
			System.out.println(decode.toString());
		}
	}
}

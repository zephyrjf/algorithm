/*
 *小赛的研究小组需要解决一个数据编解码传输的问题，可以将任意的字符串重新编码传输。
 *其中的编码规则为：将要编码的数据拆分成字节数组，3字节为一组按顺序排列为24 位，再将24位分成每组6位的4组数据。然后在每组的最前面前补两个0位凑成一个字节。
 *通过这种方式将3个字节的数据重新编码为4个字节。然后将这4个字节中每个字节的值作为索引通过查表的方式替换为对应的字符。
 *查询表格中包含64个字符，依次为“0”-“9”、“+”、“-”，“a”-“z”以及“A”-“Z”。
 *若要编码的数据字节数不是3的整倍数，则最后一组最后填充1或2个0，并在编码完成后在结尾添加相同数目的 “=”。
 *现在小赛接收到编码完毕的数据，需要恢复编码前的数据。小赛发现，由于存在传输截断的可能性，并非所有接收的数据都可以解码。小赛希望你能帮忙编写程序。 
 * */
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//建表
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
		//开始
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

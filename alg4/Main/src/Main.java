/*
 * 双栈带括号算术求值
 * */
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Character> ops = new Stack<>();
		Stack<Double> nums = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		for (int i = 0; i < line.length(); i++) {
			char item = line.charAt(i);
			if (item == '+' || item == '-' || item == '*' || item == '/') {
				ops.push(item);
			} else if (item == '(') {
				
			} else if (item == ')') {
				double num = nums.pop();
				char op = ops.pop();
				if (op == '+') {
					num += nums.pop();
				} else if (op == '-') {
					num -= nums.pop();
				} else if (op == '*') {
					num *= nums.pop();
				} else if (op == '/') {
					num /= nums.pop();
				}
				nums.push(num);
			} else {
				nums.push(Double.parseDouble(String.valueOf(item)));
			}
		}
		System.out.println(nums.pop());
	}
}

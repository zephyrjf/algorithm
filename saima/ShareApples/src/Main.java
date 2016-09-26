/*
 * 果园里有堆苹果，N（1＜N＜9）只熊来分。第一只熊把这堆苹果平均分为N份，多了一个，它把多的一个扔了，拿走了一份。
 * 第二只熊把剩下的苹果又平均分成N份，又多了一个，它同样把多的一个扔了，拿走了一份，第三、第四直到第N只熊都是这么做的
 * 问果园里原来最少有多少个苹果？
 * */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		// sum = n^n - n + 1
		// 递归要注意凑一项
		for (int i = 0; i < n; i++) {
			sum *= n;
		}
		sum = sum - n + 1;
		System.out.println(sum);
	}
}

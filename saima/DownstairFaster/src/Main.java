/*
 * 小赛的家住在第n层，他可以选择从电梯下楼（假设只有小赛一个人会用电梯）或者走楼梯下楼。
 * 当前电梯停在第m层，如果他从电梯下到第1层，需要：电梯先到达这一层->开门->关门->电梯再到达第一层->开门（最后的开门时间也要计算在内）。
 * 小赛的家在楼层n，当前电梯停在的楼层m，
 * 以及电梯每经过一层楼的时间t1，开门时间t2，关门时间t3，还有小赛每下一层楼的时间t4，
 * 让你帮小赛计算一下，他最快到达第1层的时间。
 * */
import java.util.*;
public class Main {
	private static long t1, t2, t3, t4;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	long n = sc.nextLong();
      	long m = sc.nextLong();
      	t1 = sc.nextLong();
      	t2 = sc.nextLong();
      	t3 = sc.nextLong();
      	t4 = sc.nextLong();
      	long result1 = t4 * (n-1);
      	long result2 = (Math.abs(n-m) + n - 1) * t1 + 2 * t2 + t3;
      	result1 = result1 < result2 ? result1 : result2;
      	System.out.println(result1);
	}
}

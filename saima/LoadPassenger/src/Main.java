/*
 * X学校最近组织了一场春游踏青活动，向Y公司租赁汽车运输学生。
 * 这次参加活动的总共有n个班级，第i班总共有ai名学生，每辆车最大乘车人数为m，满足m>a1, a2, ..., an。
 * 乘车时必须按照班级排列顺序进行乘车，不能调整班级顺序进行拼车。
 * 为保证同一个班级的学生在同一辆车上，如果当前汽车装完上一个班级后，下一个班级所有同学无法装下，那么当前车开走使用下一辆车。
 * 问最少需要多少辆车才能把所有学生运完？
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] stu = new int[n];
		for (int i = 0; i < n; i++) {
			stu[i] = sc.nextInt();
		}
		
		int count = 0;
		int cur = 0;
		int tmp;
		while(cur < n) {
			count++;
			tmp = stu[cur++];
			while(cur < n && tmp + stu[cur] <= m) {
				tmp += stu[cur];
				cur++;
			}
		}
		System.out.println(count);
	}
}

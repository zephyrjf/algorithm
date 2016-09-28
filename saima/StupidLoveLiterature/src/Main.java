/*
 * 小赛现在想要创作一首恰好为一定字数（共有n个能满足要求的字数，达到任一皆可）的新诗歌……
 * 他会构想m种长度的短句（如上面那首“诗歌”，有长度为1和7的短句），构想每种长度的短句所耗费的时间是相同的。
 * 现在让你帮忙算下，小赛最少需要多少时间，才能达成自己的目标呢？如果没有办法实现，请输出"It is not true!"（没有引号）。
 * 
 * 第一行一个整数n，表示小赛想创作诗歌的字数的集合大小。
 * 接下来n行，其中第i行为一个数a[i]，表示这首诗歌可以是a[i]个字。
 * 第二行一个整数m，表示小赛可以构想出m种不同长度短句的个数。
 * 接下来m行，其中第i行为两个整数b[i],c[i]，其中b[i]表示小赛可以创作出长度为b[i]的短句，对应的c[i]表示创作这种长度短句所消耗的时间。
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int min = 0x8fffffff;
		
	}
}

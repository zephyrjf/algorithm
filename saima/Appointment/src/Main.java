/*
 * Bob和Alice有个约会，一大早Bob就从点(0,0)出发，前往约会地点(a,b)。
 * Bob没有一点方向感，因此他每次都随机的向上下左右四个方向走一步。
 * 简而言之，如果Bob当前在(x,y)，那么下一步他有可能到达(x+1,y), (x-1,y), (x,y+1), (x,y-1)。
 * 很显然，当他到达目的地的时候，已经很晚了，Alice早已离去。第二天，Alice质问Bob为什么放她鸽子，Bob说他昨天花了s步到达了约会地点。Alice怀疑Bob是不是说谎了。
 * 你能否帮她验证一下？
 * 
 * 输入三个整数a,b,s
 * */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = sc.nextInt();
		a = a < 0 ? -a : a;
		b = b < 0 ? -b : b;
		int e = s - a - b;
		if (e >= 0 && e % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

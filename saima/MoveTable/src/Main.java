/*
 * 小A有一张半径为r的圆桌，其中心位于(x,y)，现在他想把圆桌的中心移到(x1, y1)。
 * 每次移动一步，小A都得在圆桌边界上固定一个点，然后将圆桌绕这个点旋转。 问最少需要几步才能把圆桌移到目标位置？
 * */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		double d = Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
		System.out.println((int)Math.ceil(d / 2 / r));
	}
}

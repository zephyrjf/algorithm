import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] record = new int[n];
    for (int i = 0; i < n; i++) {
    	record[i] = sc.nextInt();
    }
    Arrays.sort(record);
    int d = 0, tmp = -1;
    for (int i = 0; i < n-1; i++) {
      tmp = record[i+1] - record[i];
      d = d > tmp ? d : tmp;
    }
    float fd = ((float)d) / 2;
    int leftD = record[0], rightD = l - record[n-1];
    if (leftD > rightD && leftD > fd) {
    	System.out.printf(String.format("%.2f", (float)leftD));
    } else if (rightD > leftD && rightD > fd) {
    	System.out.printf(String.format("%.2f", (float)rightD));
    } else {
    	System.out.printf(String.format("%.2f", fd));
    }
  }
}
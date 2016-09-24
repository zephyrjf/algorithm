
import java.io.*;
import java.util.*;

public class Main {
		public static void main(String args[]) {
        		Scanner sc = new Scanner(System.in);
          		int n = sc.nextInt();
          		int[] data = new int[n];
          		for (int i = 0; i < n; i++) {
                		data[i] = sc.nextInt();
                }
          		
          		int bl = data[0], r = data[n-1];
          		boolean lget = false, rget = false, valid = true;
          		for (int i = 0; i < n - 1; i++) {
                		if (!lget) {
                            if (data[i] > data[i+1]) {
                            	if (i != 0) {
                            		bl = data[i-1];
                            	} else {
                            		bl = data[0];
                            	}
                            	lget =true;
                            }
                        } else if (!rget) {
                        	if (data[i] < data[i+1]) {
                        		r = data[i];
                              	rget = true;
                        	}
                        } else if (data[i] > data[i+1]) {
                          	valid = false;
                        	break;
                        }
                }
          		if (valid && lget && (bl == data[0] || r < bl)) {
          			System.out.println("yes");
                } else {
                	System.out.println("no");
                }
        }
}

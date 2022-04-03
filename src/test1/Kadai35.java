package test1;

import java.util.*;

public class Kadai35 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int num[] = new int[n];
    for (int i = 1; i < n + 1; i++) {
    	num[i - 1] = sc.nextInt();
    }

    for (int i = 1; i < n + 1; i++) {
    	for (int j = 1; j < num[i - 1] + 1; j++) {
    		System.out.print(j);
			if (j == num[i - 1]) {
			      System.out.println();
			} else {
			      System.out.print(" ");
			}
        }
    }
    sc.close();
  }
}
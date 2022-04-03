package test1;

import java.util.*;

public class Kadai33 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = 1; i < n + 1; i++) {
    	for (int j = 1; j < i + 1; j++) {
    		System.out.print(j);
			if (j == i) {
			      System.out.println();
			} else {
			      System.out.print(" ");
			}
        }
    }
    sc.close();
  }
}
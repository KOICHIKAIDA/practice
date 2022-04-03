package test1;

import java.util.*;

public class Kadai32 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    for (int i = 1; i < n + 1; i++) {
      System.out.print(i);
      if (i == n) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }

    for (int i = 1; i < m + 1; i++) {
        System.out.print(i);
        if (i == m) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }

    sc.close();
  }
}
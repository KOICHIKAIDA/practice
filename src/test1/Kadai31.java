package test1;

import java.util.*;

public class Kadai31 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = 1; i < n + 1; i++) {
      System.out.print(i);
      if (i == n / 2 || i == n) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }

    sc.close();
  }
}
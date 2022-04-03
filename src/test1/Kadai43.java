package test1;

import java.util.*;

public class Kadai43 {

	// 自然数 N, M が与えられます。N が M けたになるよう数値の前に半角スペースを埋めて出力してください。

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    System.out.println(String.format("%"+ m + "s", n));
	  }
}
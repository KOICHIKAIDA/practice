package test1;

import java.util.*;

public class Kadai41 {

	// 自然数 N が与えられます。N が 3 けたになるよう数値の前に 0 を埋めて出力してください。

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    System.out.println(String.format("%3s", n).replace(" ", "0"));
	  }
}
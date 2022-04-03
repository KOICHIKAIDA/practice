package test1;

import java.util.*;

public class Kadai42 {

	// 自然数 N が与えられます。N 個の自然数が与えられるので、それぞれを数値 M_i について以下の処理を行ってください。
	// * M_i が 3 けたになるよう数値の前に半角スペースを埋めて出力してください。

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int m[] = new int[n];
		    for (int i = 0; i < n; i++) {
		    	m[i] = sc.nextInt();
		    }

		    for (int i = 0; i < n; i++) {
		    	System.out.println(String.format("%3s", m[i]));
		    }
	  }
}
package test1;

import java.util.*;

public class Kadai44 {

	// 自然数 N, M と N 個の自然数 A_1, A_2, ..., A_N が与えられます。
	// それぞれの数値が M けたになるよう数値の前に半角スペースを埋めて、改行区切りで出力してください。
	//
	// 入力例1
//	     4 3
//	     0
//	     8
//	     81
//	     813
	//
	// 出力例1
//	     0
//	     8
//	     81
//	     813

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int a[] = new int[n];
		    for (int i = 0; i < n; i++) {
		    	a[i] = sc.nextInt();
		    }

		    for (int i = 0; i < n; i++) {
		    	System.out.println(String.format("%" + m + "s", a[i]));
		    }
	  }
}
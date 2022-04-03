package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki14 {
	// 0から9までを数えるカウンタを考えます。
	//
	// 0 → 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9
	//
	// このカウンタの拡張として、任意の数から始められるカウンタを考えました。
	//
	// 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → 0 → 1
	// （2から始める例、カウンタは9まで進んだら0に戻ります）
	//
	//
	//
	// 入力から数字nを受け取り、nからカウンタをスタートさせて、
	//
	// カウンタの値を順番に10個出力するプログラムを実装してください。
	//
	//
	// すべてのテストケースにおいて、以下の条件をみたします。
	//
	// 0 ≤ n ≤ 9
	//
	//
	// 入力例2
	//
//	     2
//
	// 出力例2
	//
//	     2
//	     3
//	     4
//	     5
//	     6
//	     7
//	     8
//	     9
//	     0
//	     1

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();

		    for (int i = 0; i < 10; i++) {
		    	if (n + i > 9) {
			    	System.out.println(n + i - 10);
		    	} else {
			    	System.out.println(n + i);
		    	}
		    }
	  }
}

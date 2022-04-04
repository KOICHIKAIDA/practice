package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki20 {
	// 入力として、現在の所持金額（円）が与えられます。
	//
	// その所持金額で10円の駄菓子をいくつ買うことができるか計算し、出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// m
	//
	// ・mは所持金額（円）
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// m円で10円の駄菓子をいくつ買えるか計算し、出力してください。
	//
	//
	// 入力例2
	//
//	     72355
	//
	// 出力例2
	//
//	     7235

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int m = sc.nextInt();
		    System.out.println(m / 10);

	  }
}

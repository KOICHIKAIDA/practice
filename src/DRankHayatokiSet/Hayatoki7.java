package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki7 {
	// 鉛筆の濃さは一般的に17種類あり、濃い方から順番に
	// 6B, 5B, 4B, 3B, 2B, B, HB, F, H, 2H, 3H, 4H, 5H, 6H, 7H, 8H, 9H
	// というように分けられています。
	// これらの中で、k番目に濃い鉛筆の濃さを出力してください。
	//
	// 入力は以下のフォーマットで与えられます
	//
	// k
	//
	// ・入力される数字 k
	// ・入力は1行となり、末尾に改行を一つ含みます。
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	// k番目に濃い鉛筆の濃さを出力してください。
	//
	// 入力例1
	//
//	     3
	//
	// 出力例1
	//
//	     4B

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String[] str = {"6B", "5B", "4B", "3B", "2B", "B", "HB", "F", "H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H"};
		    int k = sc.nextInt();
		    System.out.println(str[k - 1]);
	  }
}

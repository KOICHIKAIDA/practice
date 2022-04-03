package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki6 {
	// 入力された式を計算するプログラムを作成します。
	// ここでは、入力される式は、次のような形で表されるものとします。
	//
	// (値1) + (値2)
	//
	// 入力された式を計算し、その計算結果を出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// v1 + v2
	//
	// ・v1とv2は、0以上の整数
	// ・+ の前後に空白を1つ含みます。
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	// 入力された式を計算し、その計算結果を出力してください。
	//
	// 入力例1
	//
//	     1 + 1
	//
	// 出力例1
	//
//	     2

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String str = sc.nextLine();
		    int v1 = Integer.parseInt(str.substring(0, str.indexOf(" + ")));
		    int v2 = Integer.parseInt(str.substring(str.indexOf(" + ") + 3, str.length()));
		    System.out.println(v1 + v2);
	  }
}

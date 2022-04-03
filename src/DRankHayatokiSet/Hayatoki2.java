package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki2 {
	// 一般的に、n角形の内角の和は 180°×(n - 2) で求めることができます。
	// nが入力として与えられるので、正n角形の1つの内角を計算して出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// n
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	// 正n角形の1つの内角の大きさを出力してください。
	// （ただし、小数点以下は切り捨てて出力してください）
	//
	// 入力例2
	//
//	     7
	//
	// 出力例2
	//
//	     128

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int ans = (180 * (n - 2)) / n;
		    System.out.println(ans);
	  }
}

package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki13 {
	// 一般的な通勤電車では、一両辺りの乗車定員は140人ほどと言われています。
	// 一両に乗車した人数が入力として与えられるので、
	// 一両辺りの乗車定員を140人としたときの乗車率を出力してください。
	//
	// ただし、乗車率（%）は以下で求めることができます。
	// （乗車人数）/（乗車定員）× 100
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// n
	//
	// ・nは一両に乗車した人数
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 乗車率xを求め、
	//
	// x%
	//
	// （%は半角）のように出力してください。
	//
	// ただし、乗車率は小数点以下を切り捨てて出力してください。
	//
	//
	// 入力例1
	//
//	     200
	//
	// 出力例1
	//
//	     142%

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    double n = sc.nextDouble();
		    double d = n / 140;

			System.out.println((int)(Math.floor(d * 100)) + "%");

	  }
}

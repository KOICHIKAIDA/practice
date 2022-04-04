package Paizanomori1;

import java.util.Scanner;

public class Subject03 {
	// 自動車の実燃費を調べたいと思ったとき、以下のような手順で調べることができます。
	//
	// 1. 燃料を満タンにし、給油量を記録する
	// 2. 給油が必要になるまでの走行距離を記録する
	// 3. （記録した走行距離）/（記録した給油量）を計算する
	//
	//
	// 給油量と（L）と記録した走行距離（km）が入力として与えられるので、
	//
	// 上の方法で燃費（km/L）を計算して出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// v d
	//
	// ・vは給油量（L）を表す整数値
	// ・dは記録した走行距離（km）を表す整数値
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 自動車の燃費（km/L）を計算し、出力してください。
	//
	// ただし、燃費は小数点以下を切り捨てて出力してください。
	//
	//
	// 入力例1
	//
//	     65 600
	//
	// 出力例1
	//
//	     9
	//
	// 入力例2
	//
//	     36 831
	//
	// 出力例2
	//
//	     23
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int v = sc.nextInt();
		    int d = sc.nextInt();
		    System.out.println(d / v);
	  }
}
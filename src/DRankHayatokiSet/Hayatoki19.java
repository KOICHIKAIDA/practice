package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki19 {
	// 人が聞くことができる音の周波数は、20Hzから15,000Hzほどであると言われており、
	//
	// 15,000Hzから20,000Hzの音が聞こえるかどうかには個人差があるそうです。
	//
	// 入力として音の周波数が与えられるので、
	//
	// その音が聞くことのできる周波数の範囲に入っているかどうかを判定して出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// f
	//
	// ・fは自然数
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// ・20 ≤ f ≤ 15000 のとき、yes
	// ・15000 < f ≤ 20000 のとき、not sure
	// ・それ以外のとき、no
	// を出力してください。
	//
	//
	// 入力例1
	//
//	     440
	//
	// 出力例1
	//
//	     yes
	//
	// 入力例2
	//
//	     30000
	//
	// 出力例2
	//
//	     no
	//
	// 入力例3
	//
//	     18000
	//
	// 出力例3
	//
//	     not sure

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int f = sc.nextInt();
		    if (20 <= f && f <= 15000) {
		    	System.out.println("yes");
		    } else if (15000 < f && f <= 20000) {
		    	System.out.println("not sure");
		    } else {
		    	System.out.println("no");
		    }
	  }
}

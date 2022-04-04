package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki17 {
	// 騒音値は、デシベル（dB）という単位で表され、
	//
	// 騒音値の大きさで、騒音の大きさが判断されます。
	//
	// 30 dB 未満 : 静か
	// 30 dB 以上 50 dB 未満 : 普通
	// 50 dB 以上 70 dB 未満 : うるさい
	// 70 dB 以上 : とてもうるさい
	//
	//
	// 入力として騒音値（dB）が与えられるので、
	//
	// 騒音の大きさがどれほどであるのかを出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// l
	//
	// ・lは騒音値を表す自然数
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// ・l < 30 のとき、 quiet
	// ・30 ≤ l < 50 のとき、normal
	// ・50 ≤ l < 70 のとき、noisy
	// ・70 ≤ l のとき、 very noisy
	// を出力してください。
	//
	//
	// 入力例2
	//
//	     80
//
	// 出力例2
	//
//	     very noisy

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int l = sc.nextInt();
		    if (l < 30) {
		    	System.out.println("quiet");
		    } else if (30 <= l && l < 50) {
		    	System.out.println("normal");
		    } else if (50 <= l && l <= 70){
		    	System.out.println("noisy");
		    } else if (70 <= l) {
		    	System.out.println("very noisy");
		    }
	  }
}

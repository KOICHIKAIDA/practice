package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki15 {
	// 昨日と比べて、今日の気温が高いのか低いのかを教えてくれるプログラムを作成したいと思いました。
	//
	// 昨日の気温と今日の気温が入力として与えられるので、
	//
	// 気温がどれだけ変化したかを計算して出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// t1 t2
	//
	// ・t1は昨日の気温
	// ・t2は今日の気温
	// ・t1, t2は0以上の整数
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// ・昨日より今日の方が暖かければ、+（気温差）
	// ・昨日と今日が同じ気温なら、0
	// ・昨日より今日の方が寒ければ、-（気温差）
	// を出力してください。
	//
	//
	// 入力例2
	//
//	     17 15
//
	// 出力例2
	//
//	     -2

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int t1 = sc.nextInt();
		    int t2 = sc.nextInt();

		    if (t2 > t1) {
		    	System.out.println("+" + (t2 - t1));
		    } else if (t2 == t1) {
		    	System.out.println(t2 - t1);
		    } else {
		    	System.out.println(t2 - t1);
		    }

	  }
}

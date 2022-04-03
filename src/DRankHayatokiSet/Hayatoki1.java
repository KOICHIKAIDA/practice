package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki1 {
	// あなたは健康のために、1日1万歩を歩くことを目標にしました。
	//
	// 入力として、歩いた距離(km)と歩幅(cm)が与えられるので、
	//
	// 1万歩を歩いているかどうかを判定して結果を出力してください。
	//
	// 入力は以下のフォーマットで与えられます
	//
	// d s
	//
	// ・d は歩いた距離(km)
	// ・s は歩幅(cm)
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	// 歩数が
	// ・1万歩以上であれば yes
	// ・1万歩より少なければ no
	// を出力してください。
	//
	// ただし、歩いているときの歩幅は一定であるとします。
	//
	// 入力例1
	//
//	     10 100
	//
	// 出力例1
	//
//	     yes

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int d = sc.nextInt();
		    int s = sc.nextInt();
		    int steps = (d * 1000 * 100) / s;
		    if (steps >= 10000) {
		    	System.out.println("yes");
		    } else {
		    	System.out.println("no");
		    }
	  }
}

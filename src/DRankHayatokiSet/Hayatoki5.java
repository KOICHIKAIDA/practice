package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki5 {
	// 入力した文字列にアンダーラインをするプログラムを作成することにしました。
	// しかし、テキスト上でアンダーラインを追加することはできないので、
	// アンダーラインの代わりに文字列の下に、文字列の長さの分だけ ^ を追加することで
	// アンダーラインを再現することにしました。
	// 入力された文字列に、^ によるアンダーラインを追加して出力してください。
	//
	// 入力は以下のフォーマットで与えられます
	//
	// s
	//
	// sは任意の半角文字列
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	// 任意の文字列 zzzzz が入力されたとき、
	// zzzzz
	// ^^^^^
	// を表示してください。
	// （ただし、^ の個数は入力された文字列の長さと同じにしてください。）
	//
	//
	// 入力例1
	//
//	     abcdefg
	//
	// 出力例1
	//
//	     abcdefg
//	     ^^^^^^^

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.nextLine();
		    System.out.println(s);
		    for (int i = 0; i < s.length(); i++) {
		    	System.out.print("^");
		    }
		    System.out.println();
	  }
}

package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki4 {
	// 自分に自信のない山田くんは、発言の最後に必ず「たぶん...」と言います。
	// そんな山田くんの発言を、自信を持って断定する口調に変えてあげましょう。
	//
	// 入力は以下のフォーマットで与えられます
	//
	// s
	//
	// sは、", maybe." (空白を含む8文字)で終わる文字列
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// sの末尾の ", maybe." を "!!" に変更して出力してください。
	//
	//
	// 入力例1
	//
//	     It is raining, maybe.
	//
	// 出力例1
	//
//	     It is raining!!

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.nextLine();
		    System.out.println(s.replace(", maybe.", "!!"));
	  }
}

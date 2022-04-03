package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki12 {
	// 山を英語で表記するとき、Mt. （山の名前）のように表すことがあります。
	// 入力として、日本の山の名前（富士山であれば Fuji）が与えられるので、
	// これを「Mt. Fuji」のような表記にして出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// s
	//
	// ・sは山の名前を表す文字列
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 山の名前を、
	//
	// Mt. (山の名前)
	//
	// （Mt.の後に空白を1つ含む）で表して出力してください。
	//
	//
	// 入力例1
	//
//	     Fuji
	//
	// 出力例1
	//
//	     Mt. Fuji

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.next();

			System.out.println("Mt. " + s);

	  }
}

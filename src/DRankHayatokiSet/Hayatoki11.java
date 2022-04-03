package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki11 {
	// 入力として、1つの英単語が与えられます。
	//
	// その英単語を縦書きにして出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます。
	//
	// s
	//
	// ・s は小文字アルファベットの文字列
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 入力された文字列を縦書きにして出力してください。
	//
	// ただし、縦書きは、文字列の1文字ずつに対して
	// ・その文字を出力
	// ・改行を出力
	// とすることで表現してください。
	//
	//
	// 入力例2
	//
//	     happy
	//
	// 出力例2
	//
//	     h
//	     a
//	     p
//	     p
//	     y

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.next();

		    for (int i = 0; i < s.length(); i++) {
			    System.out.println(s.charAt(i));
		    }

	  }
}

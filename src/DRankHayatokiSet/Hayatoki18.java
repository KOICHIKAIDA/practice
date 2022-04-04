package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki18 {
	// TGIFとは、Thank God It's Friday の頭文字を取ったもので、
	//
	// キリスト教の文化圏において、仕事や学校の長い一週間を終えて週末を迎えられることに感謝する言葉です。
	//
	// 入力として、平日の曜日が与えられるので、
	// ・Monday, Tuesday, Wednesday, Thursday であれば、Still (曜日名)
	// ・Friday であれば、TGIF
	// を出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// s
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 入力として与えられた曜日が、
	// ・Monday, Tuesday, Wednesday, Thursday のいずれかであれば、Still (曜日名)
	// ・Friday であれば、TGIF
	// を出力してください。
	//
	//
	// 入力例2
	//
//	     Friday
	//
	// 出力例2
	//
//	     TGIF

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.next();
		    if (s.equals("Friday")) {
		    	System.out.println("TGIF");
		    } else {
		    	System.out.println("Still " + s);
		    }
	  }
}

package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//大文字または小文字のアルファベットCが与えられます。Cが大文字の場合はYESを、そうではない場合はNOを出力してください。
//
//
//入力される値
//
//  C
//
//
//  入力値最終行の末尾に改行が１つ入ります。
//  文字列は標準入力から渡されます。
//
//
//期待する出力
//
//  YESまたはNOを出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//  YES
//
//
//  または
//
//  NO

public class Subject06 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String C = sc.next();
		    if (isHalfUpperAlphanumeric(C)) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }

	public static boolean isHalfUpperAlphanumeric(String str) {
		return Pattern.matches("^[A-Z]+$", str);
	}
}

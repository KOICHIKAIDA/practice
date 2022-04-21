package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//2 つの整数A、Bが与えられます。A, B の少なくとも一方が 10 以上の場合はYESを、そうではない場合はNOを出力してください。
//
//
//入力される値
//
//  A B
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

public class Subject07 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if (A >= 10 || B >= 10) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

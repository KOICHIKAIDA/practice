package JoukenBunki;

import java.util.Scanner;

//文字列Sが与えられます。Sがpaizaと一致する場合はYESを、一致しない場合はNOを出力してください。
//
//入力される値
//
//  S
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//
//期待する出力
//
//YESまたはNOを出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//YES
//
//
//または
//
//NO
//
//
//入力例1
//
//  paiza
//
//出力例1
//
//  YES
//
//入力例2
//
//  pizza
//
//出力例2
//
//  NO

public class Subject01 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String S = sc.next();
		    if (S.equals("paiza")) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

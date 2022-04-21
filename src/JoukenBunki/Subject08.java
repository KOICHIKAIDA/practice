package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//整数Xが与えられます。Xが 10 以上ではない場合はYESを、Xが 10 以上である場合はNOを出力してください。
//
//
//入力される値
//
//  X
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

public class Subject08 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int X = sc.nextInt();
		    if (!(X >= 10)) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

package JoukenBunki;

import java.util.Scanner;

//整数Nが与えられます。Nが 100 以下の場合はYESを、そうではない場合はNOを出力してください。
//
//入力される値
//
//  N
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
//  50
//
//出力例1
//
//  YES
//
//入力例2
//
//  150
//
//出力例2
//
//  NO

public class Subject02 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    if (N <= 100) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

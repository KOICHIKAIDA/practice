package JoukenBunki;

import java.util.Scanner;

//整数 A, B, C が与えられます。式 A × B ≦ C が成立している場合はYESを、そうではない場合はNOを出力してください。
//
//
//入力される値
//
//  A B C
//
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
//  2 3 7
//
//出力例1
//
//  YES
//
//入力例2
//
//  3 6 17
//
//出力例2
//
//  NO

public class Subject04 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    if (A * B <= C) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

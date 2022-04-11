package RonriEnzan;

import java.util.Scanner;

public class Subject09 {
	// 京子ちゃんは 二進数 1 けたの整数 A と B を使って、 A + B を計算したいと思っています。
	//
	//   A
	// + B
	// ---
	//  CS
	//
	// C…2桁目(Carry)
	// S…1桁目(Sum)
	//
	// 上記の画像のように、 A と B を足した結果 (2 進表記) の下から 2 けた目の値を C 、下から 1 けた目の値を S とします。 C と S を出力してください
	//
	//
	// 入力される値
	//
//	     A B
	//
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 期待する出力
	//
	// C, S をこの順に、半角スペース区切りで出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	//
//	     C S
	//
	//
	// 入力例1
	//
//	     0 1
	//
	// 出力例1
	//
//	     0 1
	//
	// 入力例2
	//
//	     1 1
	//
	// 出力例2
	//
//	     1 0
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();

		    System.out.println((A & B) + " " + (A ^= B));
	  }
}

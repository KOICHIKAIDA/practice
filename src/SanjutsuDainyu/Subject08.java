package SanjutsuDainyu;

import java.util.Scanner;

public class Subject08 {
	// 整数 A, B, C が与えられます。以下のアルゴリズムを実行してください。
	//
	// 変数 N を 0 で初期化する
	// N に A を足した値を N へ代入する
	// N に B をかけた値を N へ代入する
	// N を C で割ったあまりを N へ代入する
	// N を出力する
	//
	//
	// 入力される値
	//
//	     A B C
	//
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 計算結果 N を一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	//
	// N
	//
	//
	// すべてのテストケースにおいて、以下の条件をみたします。
	//
	// ・ A, B, C は整数
	// ・ A, B, C は 1 以上 1,000 未満
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = 0;
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    N = N + A;
		    N = N * B;
		    N = N % C;
		    System.out.println(N);
	  }
}

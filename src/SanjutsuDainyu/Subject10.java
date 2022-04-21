package SanjutsuDainyu;

import java.util.Scanner;

public class Subject10 {
	// 整数 A, B が与えられます。以下のアルゴリズムを実行してください。
	//
	// 変数 N を 10,000 で初期化する
	// N を A で割った商を N へ代入する
	// N を B で割った余りを N へ代入する
	// N を出力する
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
	// 期待する出力
	//
	// 計算結果 N を一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	//
	// N
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int A = sc.nextInt();
		  int B = sc.nextInt();
		  int N = 10000;
		  N = N / A;
		  N = N % B;
		  System.out.println(N);
	  }
}

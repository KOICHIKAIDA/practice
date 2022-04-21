package SanjutsuDainyu;

import java.util.Scanner;

public class Subject09 {
	// 以下のアルゴリズムを実行してください。
	// 
	// 変数 N を 10,000 で初期化する
	// N を 361 で割った商を N へ代入する
	// N を 28 で割った余りを N へ代入する
	// N を出力する
	// 
	// 
	// 入力される値
	// 
	// ありません
	// 
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。 
//	     
	// 計算結果 N を一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	// 
	// N
	  public static void main(String[] args) {
		  int N = 10000;
		  N = N / 361;
		  N = N % 28;
		  System.out.println(N);
	  }
}

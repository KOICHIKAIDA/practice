package RonriEnzan;

import java.util.Scanner;

public class Subject03 {
	// 0 または 1 の整数 A が与えられます。 NOT A の結果を出力してください。
	// ここで、 NOT 演算とは、以下の表にしたがって算出する論理演算のことを指します。
	// 入力	出力
	// 0	1
	// 1	0
	//
	//
	// 入力される値
	//
//	     A
	//
	//
//	     入力値最終行の末尾に改行が１つ入ります。
//	     文字列は標準入力から渡されます。
	//
	//
	// NOT A の結果を 0 または 1 で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    System.out.println(A ^= 1);
	  }
}

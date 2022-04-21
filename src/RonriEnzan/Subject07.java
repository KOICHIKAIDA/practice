package RonriEnzan;

import java.util.Scanner;

public class Subject07 {
	// 0 または 1 の整数 A と B が与えられます。 A NOR B の結果を出力してください。
	// ここで、 NOR 演算とは、以下の表にしたがって算出する論理演算のことを指します。
	// 入力1	入力2	出力
	// 0	0	1
	// 0	1	0
	// 1	0	0
	// 1	1	0
	//
	//
	// 入力される値
	//
//	     A B
	//
	//
//	     入力値最終行の末尾に改行が１つ入ります。
//	     文字列は標準入力から渡されます。
	//
	//
	// A NOR B の結果を 0 または 1 で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int AB = A |= B;
		    System.out.println(AB ^= 1);
	  }
}

package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki10 {
	// 白黒のボーダー柄を描くプログラムを作成します。
	//
	// 入力として自然数n が与えられるので、n回ボーダー柄のパターンを表示してください。
	//
	// ただし、
	// ・黒い部分は ##########（#を10個）
	// ・白い部分は ..........（.を10個）
	// で表現するものとします。
	//
	// また、ボーダー柄は黒い部分と白い部分を合わせて1回のパターンとします。
	//
	//
	// 入力は以下のフォーマットで与えられます。
	//
	// n
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// n回ボーダー柄のパターンを出力してください。
	//
	//
	// 入力例2
	//
//	     3
	//
	// 出力例2
	//
//	     ##########
//	     ..........
//	     ##########
//	     ..........
//	     ##########
//	     ..........

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int m = sc.nextInt();
		    String border1 = "##########";
		    String border2 = "..........";

		    for (int i = 0; i < m; i++) {
			    System.out.println(border1);
			    System.out.println(border2);
		    }

	  }
}

package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki3 {
	// 周波数のわずかに異なる音が干渉すると、うなりが生じます。
	// うなりの周波数は2つの音の周波数のうち、大きい方の周波数から小さい方の周波数を引くことで計算できます。
	// 2つの音の周波数が入力されるので、うなりの周波数を計算して出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// f1 f2
	//
	// f1、f2は周波数の値
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// f1とf2のうなりの周波数を出力してください。
	//
	//
	// 入力例1
	//
//	     440 442
//
	// 出力例1
	//
//	     2

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int f1 = sc.nextInt();
		    int f2 = sc.nextInt();
		    System.out.println(Math.abs(f1 - f2));
	  }
}

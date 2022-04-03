package test1;

import java.util.*;

public class Kadai49 {

	// 自然数 H, W, A, B が与えられます。
	// 縦に H 行、横に W 行で計 H * W 個の (A, B) という形式で文字列を出力してください。
	// ただし、横は | (半角スペース 2 つとバーティカルライン) 区切りで、縦は = で区切って出力してください。
	// また、縦の文字列間で = を出力する際は、その上の行と文字数がそろうように出力します。
	// また、A と B は 9 けたになるように半角スペースを数値の前(右詰め)に埋めて出力してください。

	// 入力例1
	//
//	     2 3 7 8
//
	// 出力例1
	//
//	     (        7,         8) | (        7,         8) | (        7,         8)
//	     ========================================================================
//	     (        7,         8) | (        7,         8) | (        7,         8)

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int H = sc.nextInt();
		    int W = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    for (int i = 0; i < H; i++) {
		      for (int j = 0; j < W; j++) {
				    System.out.print("(" + String.format("%9s", A) + ", " + String.format("%9s", B) + ")");
				    if (j != W - 1) {
				    	System.out.print(" | ");
				    } else {
				    	System.out.println();
				    }
		      }
		      if (i != H - 1) {
			        for (int j = 0; j < 22 + (25 * (W - 1)); j++) {
			          System.out.print("=");
			        }
			        System.out.println();
			      }
		    }
		  }
}
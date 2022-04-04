package Paizanomori1;

import java.util.Scanner;

public class Subject01 {
	// スポーツ名が与えられたときに、そのスポーツの1チームの人数を表示するプログラムを作成してください。
	//
	// ただし、各スポーツの競技人数は以下であるとします。
	// ・野球：9人
	// ・サッカー：11人
	// ・ラグビー：15人
	// ・バスケットボール：5人
	// ・バレーボール：6人
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// s
	//
	// sはスポーツ名
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 入力されたスポーツの1チームの人数を出力してください。
	// ただし、各スポーツの1チームの人数は以下であるものとします。
	// baseball : 9
	// soccer : 11
	// rugby : 15
	// basketball : 5
	// volleyball : 6
	//
	//
	// 入力例1
	//
//	     baseball
//
	// 出力例1
	//
//	     9
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String a[] = {"baseball", "soccer", "rugby", "basketball", "volleyball"};
		    int b[] = {9, 11, 15, 5, 6};

		    String s = sc.next();
		    for (int i = 0; i < a.length; i++) {
		    	if (a[i].equals(s)) {
		    		System.out.println(b[i]);
		    		break;
		    	}
		    }
	  }
}

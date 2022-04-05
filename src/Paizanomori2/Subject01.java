package Paizanomori2;

import java.util.Scanner;

public class Subject01 {
	// 競輪の選手は、遠くからでも見分けがつくように、鮮やかな単色のユニフォームを着用しています。
	// 
	// ユニフォームの色は、車番と呼ばれる、各選手に割り当てられた番号によって決まっています。
	// 
	// 1番車 : 白
	// 2番車 : 黒
	// 3番車 : 赤
	// 4番車 : 青
	// 5番車 : 黄
	// 6番車 : 緑
	// 7番車 : オレンジ
	// 8番車 : ピンク
	// 9番車 : 紫
	// 
	// 入力として車番が与えられるので、その選手のユニフォームの色を出力してください。
	// 
	// 
	// 入力は以下のフォーマットで与えられます
	// 
	// n
	// 
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。 
	// 
	// 
	// nが
	// ・1のとき、white
	// ・2のとき、black
	// ・3のとき、red
	// ・4のとき、blue
	// ・5のとき、yellow
	// ・6のとき、green
	// ・7のとき、orange
	// ・8のとき、pink
	// ・9のとき、purple
	// を出力してください。
	// 
	// 
	// 
	// 
	// 入力例1
	// 
//	     2
	// 
	// 出力例1
	// 
//	     black
	// 
	// 入力例2
	// 
//	     5
	// 
	// 出力例2
	// 
//	     yellow
	
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String color[] = {"white", "black", "red", "blue", "yellow", "green", "orange", "pink", "purple"};

		    int n = sc.nextInt();
		    System.out.println(color[n - 1]);
	  }
}

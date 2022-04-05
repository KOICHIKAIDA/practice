package Paizanomori2;

import java.util.Scanner;

public class Subject04 {
	// ある服屋さんはズボンの在庫を抱えてしまったため、以下のようなセールを行うことにしました。
	// 
	// ・ズボンを一点以上買っていて、
	// ・2000円以上お買い上げ
	// の方は合計金額から500円引き。
	// 
	// あるお客さんの購入アイテムが入力されるので、
	// 
	// セール割引を適用したあとの合計金額を出力してください。
	// 
	// 
	// 入力は以下のフォーマットで与えられます
	// 
	// n
	// c_1 p_1
	// c_2 p_2
	// ...
	// c_n p_n
	// 
	// ・購入アイテム数n
	// ・c_1, c_2, ..., c_n はアイテム名（shirt または pants　または shoes のいずれか）
	// ・p_1, p_2, ..., p_n はそのアイテムの金額
	// 
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。 
	// 
	// 
	// 購入アイテムの合計金額を出力してください。
	// ただし、
	// ・ズボン（pants）を一点以上買っていて、
	// ・合計金額が2000円以上
	// の場合は合計金額を500円引きして出力してください。
	// 
	// 
	// 入力例2
	// 
//	     4
//	     shirt 500
//	     pants 1000
//	     pants 500
//	     shoes 2000
	// 
	// 出力例2
	// 
//	     3500
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    String c[] = new String[n];
		    int p[] = new int[n];
		    
		    for (int i = 0; i < n; i++) {
		    	c[i] = sc.next();
		    	p[i] = sc.nextInt();
		    }
		    
		    boolean pantsFlg = false;
		    int price = 0;
		    
		    for (int i = 0; i < n; i++) {
		    	if (c[i].equals("pants")) {
		    		pantsFlg = true;
		    	}
		    	price = price + p[i];
		    }
		    
		    if (pantsFlg == true && price >= 2000) {
		    	System.out.println(price - 500);
		    } else {
		    	System.out.println(price);
		    }
		    
	  }
}

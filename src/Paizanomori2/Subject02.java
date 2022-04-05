package Paizanomori2;

import java.util.Scanner;

public class Subject02 {
	// エレベーターで移動するとき、上のボタンか下のボタンのどちらかを押して移動します。
	// 
	// 
	// 入力として現在の階と、移動したい階が与えられるので、
	// 
	// 上と下のどちらのボタンを押せばよいかを判定し、出力してください。
	// 
	// 
	// ただし、現在いる階と移動したい階は、1階 ~ 9階のいずれかであるとします。
	// 
	// 
	// 入力は以下のフォーマットで与えられます
	// 
	// f1 f2
	// 
	// ・f1 は現在の階を表す文字列で、1F, 2F, ..., 9F のいずれか
	// ・f2 は移動したい階を表す文字列で、1F, 2F, ..., 9Fのいずれか
	// 
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。 
	// 
	// 
	// 移動したい階が、現在の階よりも
	// ・上にあるとき、up
	// ・下にあるとき、down
	// を出力してください。
	// 
	// 
	// 
	// 
	// 入力例1
	// 
//	     1F 7F
	// 
	// 出力例1
	// 
//	     up
	// 
	// 入力例2
	// 
//	     5F 2F
	// 
	// 出力例2
	// 
//	     down
	
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String f1 = sc.next();
		    String f2 = sc.next();
		    
		    if (Integer.parseInt(f1.substring(0, 1)) < Integer.parseInt(f2.substring(0, 1))) {
		    	System.out.println("up");
		    } else if (Integer.parseInt(f1.substring(0, 1)) > Integer.parseInt(f2.substring(0, 1))) {
		    	System.out.println("down");
		    }
	  }
}

package Paizanomori2;

import java.util.Scanner;

public class Subject03 {
	// 長方形の隣接する2辺の長さが入力として与えられます。
	// 
	// 長方形の面積を計算して出力してください。
	// 
	// 
	// ただし、長さ0の辺がある場合には invalid と出力してください。
	// 
	// 
	// 入力は以下のフォーマットで与えられます
	// 
	// e1 e2
	// 
	// ・e1, e2は、隣接するそれぞれの辺の長さ（0以上の整数）
	// 
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	// 
	// 
	// 長方形の面積（e1 × e2）を計算して出力してください。
	// 
	// ただし、e1 もしくは e2 が 0 の場合には invalid と出力してください。
	// 
	// 
	// 入力例1
	// 
//	     7 5
	// 
	// 出力例1
	// 
//	     35
	// 
	// 入力例2
	// 
//	     0 10
	// 
	// 出力例2
	// 
//	     invalid	
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int e1 = sc.nextInt();
		    int e2 = sc.nextInt();
		    
		    if (e1 * e2 == 0) {
		    	System.out.println("invalid");
		    } else {
		    	System.out.println(e1 * e2);
		    }
		    
	  }
}

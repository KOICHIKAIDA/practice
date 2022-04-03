package test1;

import java.util.*;

public class Kadai45 {

	// 文字列 S, T が与えられます。S + T = ST という形式で文字列を出力してください。
	//
	// 入力例1
	//
//	     kirishima
//	     kyoko
//
	// 出力例1
	//
//	     kirishima + kyoko = kirishimakyoko

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.next();
		    String t = sc.next();
		    System.out.println(s + " + " + t + " = " + s + t);
	  }
}
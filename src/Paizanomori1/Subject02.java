package Paizanomori1;

import java.util.Scanner;

public class Subject02 {
	// アルバイトの休憩時間には決まりがあり、
	//
	// ・勤務時間が6時間を超え、8時間以下であるときには、45分
	// ・勤務時間が8時間を超えるときには、60分
	//
	// の休憩時間を取ることが義務付けられています。
	//
	//
	// 勤務時間が入力として与えられるので、休憩が発生するかどうかを調べ、
	//
	// 休憩時間が発生する場合には、休憩時間（分）を出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// h
	//
	// ・hは勤務時間
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// ・休憩時間が発生しないときは、no break
	// ・休憩時間が発生する場合には、x min
	// 　（xは休憩時間(分)、xとminの間に空白を1つ含みます）
	// を出力してください。
	//
	//
	// 入力例1
	//
//	     9
	//
	// 出力例1
	//
//	     60 min
	//
	// 入力例2
	//
//	     6
	//
	// 出力例2
	//
//	     no break
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int h = sc.nextInt();
		    if (h > 6 && h <= 8) {
		    	System.out.println("45 min");
		    } else if (h > 8) {
		    	System.out.println("60 min");
		    } else {
		    	System.out.println("no break");
		    }
	  }
}

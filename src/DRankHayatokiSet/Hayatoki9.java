package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki9 {
	// 30人が横に並んで、二人三脚のように足を紐で結ぶと、全体で「31脚」になります。
	// 入力として人数mが与えられるので、
	// m人で二人三脚のように足を紐で結んだとき、全体で「何脚」になるかを出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// m
	//
	// ・mは人数
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// m人で二人三脚のように足を紐で結んだとき、全体で「何脚」になるかを出力してください。
	//
	//
	// 入力例1
	//
//	     2
	//
	// 出力例1
	//
//	     3

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int m = sc.nextInt();
		    System.out.println(m + 1);
	  }
}

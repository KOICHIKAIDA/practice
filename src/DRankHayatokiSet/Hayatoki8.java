package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki8 {
	// 靴のサイズ表記には、一般的な cm(センチメートル)の表記以外に、USサイズとUKサイズがあります。
	//
	// メンズの靴の場合、
	//
	// ・USサイズは、cmの表記から18を引いたもの
	// ・UKサイズは、cmの表記から18.5を引いたもの
	//
	// として求めることができます。
	//
	// cmで表されたメンズ靴のサイズを、USサイズとUKサイズに変換して出力してください。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// s
	//
	// ・sは靴のサイズ(cm)
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// スペース区切りで
	// (USサイズ) (UKサイズ)
	// とし、最後に改行して出力してください。
	//
	// ただし、USサイズ、UKサイズは、
	// 整数の場合でも小数点以下1桁まで出力してください。
	// （USサイズが8のときは、8.0として出力してください）
	//
	//
	// 入力例1
	//
//	     26.5
	//
	// 出力例1
	//
//	     8.5 8.0

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    float s = sc.nextFloat();
		    System.out.println((s - 18.0) + " " + (s - 18.5));
	  }
}

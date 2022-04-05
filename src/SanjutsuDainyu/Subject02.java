package SanjutsuDainyu;

import java.util.Scanner;

public class Subject02 {
	
	// 整数 A, B が与えられます。A と B の差 D と積 P を半角スペース区切りで出力してください。
	// 
	// 
	// A B
	// 
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。 
	// 
	// 
	// 期待する結果 D と P を半角スペース区切り一行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	// 
	// D P
	// 
	// 
	// 入力例1
	// 
//	     397 646
	// 
	// 出力例1
	// 
//	     -249 256462
	// 
	// 入力例2
	// 
//	     343 444
	// 
	// 出力例2
	// 
//	     -101 152292
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    System.out.println((A - B) + " " + (A * B));
	  }
}

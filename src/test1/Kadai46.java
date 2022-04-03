package test1;

import java.util.*;

public class Kadai46 {

	// 自然数 N, A, B が与えられます。(A, B) という形式の文字列を N 回、カンマと半角スペース区切りで出力してください。
	//
	// N A B
	//
	// 入力例1
	//
//	     3 10 99
//
	// 出力例1
	//
//	     (10, 99), (10, 99), (10, 99)

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    for (int i = 0; i < N; i++) {
			    System.out.print("(" + A + ", " + B + ")");
			    if (i != N - 1) {
			    	System.out.print(", ");
			    } else {
			    	System.out.println();
			    }
		    }

	  }
}
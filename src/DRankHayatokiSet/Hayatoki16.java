package DRankHayatokiSet;

import java.util.Scanner;

public class Hayatoki16 {
	// 大文字のアルファベットには、囲われた部分があるものと、そうでないものがあります。
	//
	// 例えば、
	// ・Aは上部の三角形の部分が囲われており、囲われた部分が1つ存在します。
	// ・Bは上部と下部がそれぞれ囲われており、囲われた部分が2つ存在します。
	// ・Cには囲われた部分は存在しません。
	//
	//
	// 入力として、大文字のアルファベットが与えられるので、
	//
	// その文字にある囲われた部分の数を出力してください。
	//
	//
	// ただし、囲われた部分の数は以下であるとします。
	// ・0個 : C, E, F, G, H, I, J, K, L, M, N, S, T, U, V, W, X, Y, Z
	// ・1個 : A, D, O, P, Q, R
	// ・2個 : B
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// s
	//
	// ・sは大文字アルファベット1文字
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 入力されたアルファベットの囲われた部分の数を出力し、
	// 最後に改行して出力してください。
	//
	//
	// 入力例1
	//
//	     D
//
	// 出力例1
	//
//	     1

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    String s = sc.next();
		    String a[] = {"C", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		    String b[] = {"A", "D", "O", "P", "Q", "R"};
		    String c[] = {"B"};

		    for (int i = 0; i < a.length; i++) {
		    	if (a[i].equals(s)) {
		    		System.out.println(0);
		    	}
		    }

		    for (int i = 0; i < b.length; i++) {
		    	if (b[i].equals(s)) {
		    		System.out.println(1);
		    	}
		    }

		    for (int i = 0; i < c.length; i++) {
		    	if (c[i].equals(s)) {
		    		System.out.println(2);
		    	}
		    }
	  }
}

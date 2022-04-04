package Paizanomori1;

import java.util.Scanner;

public class Subject04 {
	// n人の野球選手の名前が背番号と一緒に入力されます。
	//
	// 各選手の背番号と名前を、背番号の数字の小さい順に並び替えて出力してください。
	//
	// ただし、同じ背番号の選手は存在しないものとします。
	//
	//
	// 入力は以下のフォーマットで与えられます
	//
	// n
	// b_1 p_1
	// b_2 p_2
	// ...
	// b_n p_n
	//
	// ・入力される文字列数n
	// ・b_1, b_2, ..., b_n は各選手の背番号
	// ・p_1, p_2, ..., p_n は選手名で、大文字のアルファベットからなる文字列
	// ・入力はn + 1行となり、末尾に改行を一つ含みます。
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// 背番号と選手名を背番号の昇順に並び替えて出力してください。
	//
	//
	// 入力例1
	//
//	     3
//	     83 PAIZA
//	     11 SUZUKI
//	     90 TANAKA
	//
	// 出力例1
	//
//	     11 SUZUKI
//	     83 PAIZA
//	     90 TANAKA
	//
	// 入力例2
	//
//	     5
//	     31 SAITO
//	     56 GORO
//	     11 IIJIMA
//	     70 NAKAMURA
//	     1 HAJIME
	//
	// 出力例2
	//
//	     1 HAJIME
//	     11 IIJIMA
//	     31 SAITO
//	     56 GORO
//	     70 NAKAMURA
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int b[] = new int[n];
		    String p[] = new String[n];

		    for (int i = 0; i < n; i++) {
		    	b[i] = sc.nextInt();
		    	p[i] = sc.next();
		    }

		    for (int i = 0; i < n - 1; i++) {
		    	int pos = i;
		    	for (int j = i + 1; j < n; j++) {
		    		if (b[j] < b[pos]) {
		    			pos = j;
		    		}
		    	}
	            int wb = b[i];
	            String wp = p[i];
	            b[i] = b[pos];
	            p[i] = p[pos];
	            b[pos] = wb;
	            p[pos] = wp;
		    }

		    for (int i = 0; i < n; i++) {
		    	System.out.println(b[i] + " " + p[i]);
		    }
	  }
}

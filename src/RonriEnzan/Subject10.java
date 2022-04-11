package RonriEnzan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject10 {
	// 京子ちゃんは 二進数 の整数同士で足し算をするプログラムを作成したいと思っています。
	// 二進数の足し算において、下から 1 けた目の計算は半加算器でできることを知り、 2 けた目の計算も同じように足し算ができないかと考えています。
	//
//	    A2 A1
	// +  B2 B1
	// +  C1
	// --------
	// C2 S2 S1
	//
	// C1…1桁目からの繰り上がり
	// S1…1桁目
	// S2…2桁目
	// C2…3桁目
	//
	// (例)
//	    0 1
	// +  1 1
	// +  1
	// --------
	//  1 0 0
	//
	// 上記の画像のように、 現在下から 2, 3 けた目を計算しようとしています。
	// そこで、入力 A, B と 1 けた目からの繰り上がり C1 が与えられます。 京子ちゃんに変わって C2 と S を計算し、出力してください。
	//
	// この問題は少し難しいので、ヒントとなる画像を用意しました。 2 つの半加算器と XOR 演算を用いることで計算することができます。
	//
	//
	// 入力される値
	//
//	     A B C1
	//
	// 入力値最終行の末尾に改行が１つ入ります。
	// 文字列は標準入力から渡されます。
	//
	//
	// C2, S をこの順に、半角スペース区切りで出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
	//
	// C2 S
	//
	//
	// 入力例1
	//
//	     0 1 1
	//
	// 出力例1
	//
//	     1 0
	//
	// 入力例2
	//
//	     0 0 0
	//
	// 出力例2
	//
//	     0 0

	  static List<Integer> halfAdder(int a, int b){
		  List<Integer> result = new ArrayList<Integer>();
		  result.add(a &= b);
		  result.add(a ^= b);
		  return result;
	  }

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C1 = sc.nextInt();

		    int CX = halfAdder(A, B).get(0);
		    int SY = halfAdder(A, B).get(1);
		    int CY = halfAdder(SY, C1).get(0);
		    int S = halfAdder(SY, C1).get(1);

		    int C2 = (CX ^= CY);

		    System.out.println(C2 + " " + S);
	  }
}

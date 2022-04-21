package SkillCheck.C;

import java.util.Scanner;

public class C098 {
	// あなたは友達とボールのパス回しをしています。
	// どうやら、このパス回しはルールが特徴的なようです。
	//
	// 最初に各人はそれぞれボールをいくつか所持しています。
	// その後、適当な順番でボールをパスしていくのですが、この際にパスする相手とボールの個数を宣言します。
	// 宣言した個数以上のボールを持っている場合は宣言した個数のボールを、そうでない場合は持っているボールすべてを、選んだ相手にパスします。
	// なお、ボールを所持できる数に上限はありません。
	//
	// このパス回しの情報が順番に与えられるので、最終的に各人が持っているボールの個数を求めてください。
	// 下図は入力例 1 の様子を表しています。
	//
	//
	// 入力は以下のフォーマットで与えられます。
	//
	// N
	// s_1
	// ...
	// s_N
	// M
	// a_1 b_1 x_1
	// ...
	// a_M b_M x_M
	//
	// ・1 行目には、人数を表す整数 N が与えられます。
	// ・続く N 行のうちの i 行目 (1 ≦ i ≦ N) には、 人 i が最初に持っているボールの個数を表す整数 s_i が与えられます。
	// ・N+2 行目には、パス回しの情報の数を表す整数 M が与えられます。
	// ・続く M 行のうちの i 行目 (1 ≦ i ≦ M) には、 i 番目のパス回しの情報を表す 3 つの整数 a_i, b_i, x_i がこの順に半角スペース区切りで与えられます。これは、人 a_i が相手として人 b_i を、そしてボールの個数 x_i を宣言したことを表します。
	//
	//
	// 期待する出力
//	     出力は以下の形式になります。
	//
//	     t_1
//	     ...
//	     t_N
	//
	// ・出力は N 行からなります。
	// ・i 行目 (1 ≦ i ≦ N) には、人 i が最終的に持っているボールの個数を表す整数 t_i を出力してください。
	// ・出力最終行の末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
	// 入力例1
	//
	// 3
	// 10
	// 5
	// 8
	// 3
	// 1 3 5
	// 3 2 3
	// 2 1 10
	//
	// 出力例1
	//
	// 13
	// 0
	// 10
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt(); // 人数

		    // 各人が持っているボールの個数
		    int s[] = new int[N];
		    for (int i = 0; i < N; i++) {
		    	s[i] = sc.nextInt();
		    }

		    int M = sc.nextInt(); // パス回し情報の個数
		    int a[] = new int[M];
		    int b[] = new int[M];
		    int x[] = new int[M];
		    for (int i = 0; i < N; i++) {
		    	a[i] = sc.nextInt(); // パスする人
		    	b[i] = sc.nextInt(); // 受ける相手
		    	x[i] = sc.nextInt(); // ボールの個数
		    }

		    for (int i = 0; i < N; i++) {
		    	// パスする人の手持ちがパスの数と等しい、もしくはパスの数が多い場合
		    	if (s[a[i] - 1] <= x[i]) {
			    	s[b[i] - 1] += s[a[i] - 1]; // 受ける人のボールがパスする人の手持分増える
			    	s[a[i] - 1] = 0; // パスする人のボールが0になる

		    	} else {
			    	s[b[i] - 1] += x[i]; // 受ける人のボールが増える
			    	s[a[i] - 1] -= x[i]; // パスする人のボールが減る
		    	}
		    }

		    for (int i = 0; i < N; i++) {
		    	System.out.println(s[i]);
		    }
	  }

}
package SkillCheck.C;

import java.util.Scanner;

public class C099 {
	// あなたは、折り紙がたくさん置かれているのをみつけました。
	// それらを連結して 1 枚の大きな紙の垂れ幕を作ることにしました。
	//
	// 各折り紙は 1 辺の長さが D cm 、すなわち縦 D cm × 横 D cm の正方形です。これらの折り紙を、左右に長く伸びた直線を基準に貼り付けていきます。
	// ただし、各折り紙について、いずれか 1 辺がちょうど直線に重なるようにします。
	// また、 1 枚目を貼り付けたあと、 2 枚目以降は以下のルールに従って順に貼り付けていきます。
	//
	// ・1 つ前に貼り付けた折り紙の右辺からみて、 1 cm 以上 D/2 cm 以下だけ重なるように貼り付ける。(下図に例を示しています。)
	//
	// 上記のルールを守って作られたある垂れ幕について、基準の直線を平面座標の x 軸とみなして、2 枚目以降の各折り紙における 1 つ前の折り紙への重なり具合が与えられます。
	// 1 枚になった垂れ幕部分の面積を計算してください。
	// 例えば、入力例 1 では以下のように計算できます。
	//
	//
	// 入力は以下のフォーマットで与えられます。
	//
	// N D
	// d_2
	// ...
	// d_N
	//
//	     ・1 行目には、折り紙の枚数を表す整数 N および折り紙の 1 辺の長さを表す整数 D が半角スペース区切りで与えられます。
//	     ・1 + i 行目 (1 ≦ i ≦ N - 1) には整数 d_{i + 1} が与えられます。これは、 i + 1 枚目の折り紙が i 枚目の折り紙に d_{i + 1} cm 重なっていることを表します。
	//
	//
	// 期待する出力
//	     ・完成した垂れ幕の折り紙部分の面積を整数で出力してください。
//	     ・出力最終行の末尾に改行を入れ、余計な文字、空行を含んではいけません。
	//
	//
	//
	// 入力例1
	//
	// 3 4
	// 2
	// 1
	//
	// 出力例1
	//
	// 36
	//
	// 入力例2
	//
	// 4 10
	// 3
	// 4
	// 5
	//
	// 出力例2
	//
	// 280
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int D = sc.nextInt();
		    int d[] = new int[N];
		    for (int i = 0; i < N - 1; i++) {
		    	d[i] = sc.nextInt();
		    }

		    int width = D;
		    for (int i = 0; i < N - 1; i++) {
		    	width = width + D - d[i];
		    }

		    System.out.println(D * width);
	  }

}
package test1;

import java.util.*;

public class Kadai39 {

	// 自然数 Q が与えられます。Q 回以下の問題に答えてください。
	//
	// * 実数 N、自然数 M が入力されます。N を丸めて小数第 M 位まで出力してください。
	// また、N の小数部が小数第 M 位に満たない場合は 0 で埋めて出力してください。

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int q = sc.nextInt();
		    double n[] = new double[q];
		    int m[] = new int[q];

		    for (int i = 0; i < q; i++) {
		    	n[i] = sc.nextDouble();
		    	m[i] = sc.nextInt();
		    }

		    for (int i = 0; i < q; i++) {
		    	System.out.printf("%." + m[i] + "f\n", n[i]);
		    }
		    sc.close();
	  }
}
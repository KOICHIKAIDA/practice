package test1;

import java.util.*;

public class Kadai38 {

	// 実数 N、自然数 M が入力されます。N を丸めて小数第 M 位まで出力してください。
	// また、N の小数部が小数第 M 位に満たない場合は 0 で埋めて出力してください。

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    double n = sc.nextDouble();
		    int m = sc.nextInt();

		    System.out.printf("%." + m + "f\n", n);

		    sc.close();
	  }
}
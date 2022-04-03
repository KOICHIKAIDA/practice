package test1;

import java.util.*;

public class Kadai47 {

	// 九九表を、横の数値間では | (半角スペース 2 つとバーティカルライン)、縦の数値間では = で区切って出力してください。
	// ただし、数値を出力する際は 2 けたになるよう半角スペース埋めで出力します。また、縦の数値間で = を出力する際は、その上の行と文字数が等しくなるように出力します。

	  public static void main(String[] args) {
		    for (int i = 1; i < 10; i++) {
		      for (int j = 1; j < 10; j++) {
		        System.out.printf("%2d", i * j);
		        if (j < 9) {
		          System.out.print(" | ");
		        } else {
		          System.out.println();
		        }
		      }
		      if (i != 9) {
		        for (int j = 0; j < 2 * 9 + 3 * (9 - 1); j++) {
		          System.out.print("=");
		        }
		        System.out.println();
		      }
		    }
		  }
}
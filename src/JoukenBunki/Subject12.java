package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//整数Nが与えられます。Nが 3 の倍数かつ 5 の倍数の場合はYESを、そうではない場合はNOを出力してください。

public class Subject12 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    if (N % 3 == 0 && N % 5 == 0) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//// 2 つの整数A、Bが与えられます。以下の条件を満たす場合はYESを、そうではない場合はNOを出力してください。
//・「Aが 10 以上」 かつ 「Bが 10 以上ではない」

public class Subject09 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if (A >= 10 && !(B >= 10)) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

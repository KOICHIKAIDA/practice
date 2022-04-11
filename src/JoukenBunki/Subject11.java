package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//3 つの整数X, Y, Zが与えられます。「Xが 10 以上」かつ「Yが 10 以上」の場合はYESを、そうではない場合はNOを出力してください。
//ただし、「Zが 10 以上の」場合はXとYの値にかかわらず、必ずYESを出力してください。

public class Subject11 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    if (Z >= 10) {
		    	System.out.println("YES");
		    } else if (X >= 10 && Y >= 10) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

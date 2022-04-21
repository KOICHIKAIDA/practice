package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//長さ N の数列Aが与えられます。この数列に含まれる偶数の要素の個数と、奇数の要素の個数を答えてください。

public class Subject13 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int A[] = new int[N];

		    for (int i = 0; i < N; i++) {
		    	A[i] = sc.nextInt();
		    }

		    int even = 0;
		    int odd = 0;

		    for (int i = 0; i < N; i++) {
		    	if (A[i] % 2 == 0) {
		    		even++;
		    	} else {
		    		odd++;
		    	}
		    }
		    System.out.println(even + " " + odd);
	  }
}

package JoukenBunki;

import java.util.Scanner;

//長さ N の数列Aが与えられます。Aの中に 0 が含まれていない場合はYESを、 0 が含まれている場合はNOを出力してください。
//
//
//入力される値
//
//  N
//  A_1
//  A_2
//  ...
//  A_N
//
//
//  入力値最終行の末尾に改行が１つ入ります。
//  文字列は標準入力から渡されます。 
//  
//
//期待する出力
//
//  YESまたはNOを出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//  YES
//
//
//  または
//
//  NO

public class Subject03 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int A[] = new int[N];
		    
		    for (int i = 0; i < N; i++) {
		    	A[i] = sc.nextInt();
		    }
		    
		    boolean flg = true;
		    for (int i = 0; i < N; i++) {
		    	if (A[i] == 0) {
		    		flg = false;
		    	}
		    }
		    
		    if (flg) {
		    	System.out.println("YES");
		    } else {
		    	System.out.println("NO");
		    }
	  }
}

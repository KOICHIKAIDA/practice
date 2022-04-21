package JoukenBunki;

import java.util.Scanner;

//整数N, 2 つの数列A, B が与えられます。
//1 ≦ i ≦ N を満たす整数 i のうち、A_i と B_i が等しくなるような i の個数を求めてください。
//
//
//入力される値
//
//N
//A_1 A_2 ... A_N
//B_1 B_2 ... B_N
//
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。 
//
//期待する出力
//
//A_i == B_iである要素の個数Cを求めてください。
//末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//C
//
//入力例1
//
//  5
//  1 2 3 4 5
//  1 20 30 4 5
//
//出力例1
//
//  3

public class Subject19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for (int i = 0; i < N; i++) {
        	A[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
        	B[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < N; i++) {
        	if(A[i] == B[i]) {
        		count++;
        	}
        }
        System.out.println(count);
        
        sc.close();
    }
}

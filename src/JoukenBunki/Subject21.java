package JoukenBunki;

import java.util.Scanner;

//2 以上の整数N, Kが与えられます。
//
//「Nを 2 倍した数でNを更新する」という操作を何度か繰り返すことを考えます。
//
//このとき, ちょうどある回数 M で N の値は K 以上になります。
//この時点で操作の繰り返しを終了することにします。
//
//この繰り返しの回数Mを求めてください。
//(Mは 0 でも構いません)
//
//例えば、Nを 2 、Kを 18 とします。
//
//上記の操作を 3 回繰り返すと、N = 16 となります。
//
//4 回くりかえすと、N = 32 となり、N >= K が成立します。
//ここで操作を終了し、最終的な操作の回数Mは 4 となります。
//
//
//入力される値
//
//N K
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//期待する出力
//
//答えとなる数値Sを 1 行で出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//S

public class Subject21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int tmp = n;
        int count = 0;
        
        while (tmp < k) {
        	tmp = tmp * 2;
        	count++;
        }

        System.out.println(count);

        sc.close();
    }
}

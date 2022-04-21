package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//整数Nが与えられます。Nのけた数を出力してください。
//
//
//入力される値
//
//N
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//
//期待する出力
//
//N のけた数Dを出力してください。
//末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//D

public class Subject17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sN = Integer.toString(N);

        System.out.println(sN.length());
        sc.close();
    }
}

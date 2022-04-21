package JoukenBunki;

import java.util.Scanner;

//-1,000 ≦ A ≦ B ≦ 1,000 を満たす 2 つの整数 A, B が与えられます。
//A 以上 B 以下である 2 つの整数 X, Y を適当に選んだとき、X * Y の取り得る値の最小値を出力してください。
//なお、X と Y は同じ値でもよいものとします。
//
//たとえば A が 3, B が 5 の場合について考えます。
//これは X と Y を両方とも 3 にしたときが最小で、 X * Y が 9 となります。
//
//
//入力される値
//
//A B
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//期待する出力
//
//答えとなる数値Nを出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//N
//
//入力例1
//
//  3 5
//
//出力例1
//
//  9

public class Subject25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0) {
            System.out.println(a * a);
        } else if (b < 0) {
            System.out.println(b * b);
        } else {
            System.out.println(a * b);
        }

        sc.close();
    }
}

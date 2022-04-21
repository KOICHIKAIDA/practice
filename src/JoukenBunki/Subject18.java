package JoukenBunki;

import java.util.Scanner;

//整数N, A, B ( - 99 ≦ N, A, B ≦ 100 ) があります。
//以下の 2 つの操作をそれぞれ 1 回ずつおこなったとき、Nを 0 にできる場合はYESを、できない場合はNOを出力してください。
//
//1. NにAを足す、またはNからAを引く
//2. NにBを足す、またはNからBを引く
//
//
//入力される値
//
//N A B
//
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//
//期待する出力
//
//YESまたはNOを出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//YES
//
//または
//
//NO

public class Subject18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (n + a + b == 0) {
            System.out.println("YES");
        } else if (n + a - b == 0) {
            System.out.println("YES");
        } else if (n - a + b == 0) {
            System.out.println("YES");
        } else if (n - a - b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

package JoukenBunki;

import java.util.Scanner;

//京子ちゃんは 1 周がNメートルの円の外周上にいます。
//京子ちゃんは 1 ターンで現在地点から K メートル時計回りに円周上を歩きます。
//スタート地点から開始してTターン歩いたとき、京子ちゃんが丁度スタート地点に戻ってきているかどうかを判定してください。
//ただし、京子ちゃんは各ターン必ず歩く必要があり、同じ場所にとどまることはできません。
//
//入力される値
//
//N K T
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//期待する出力
//
//京子ちゃんがTターン後にちょうどスタート地点にいる場合はYESを、そうではない場合はNOを出力してください。
//末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//YES
//
//
//または
//
//NO

public class Subject22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        
        if ((k * t) % n == 0) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }

        sc.close();
    }
}

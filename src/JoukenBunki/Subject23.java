package JoukenBunki;

import java.util.Scanner;

//直線上の道があり、最初は X = 0 の地点にいます。
//この道はX = T + 0.1 の地点で崖になっています。
//また、 1 歩でX軸方向にK進むことができます。
//崖に落ちずにN歩進むことはできるでしょうか。
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
//崖に落ちずにN歩進むことができる場合はYESを、そうではない場合はNOを出力してください。
//末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//YES
//
//または
//
//NO

public class Subject23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 歩数
        int n = sc.nextInt();
        // １歩あたりの距離
        int k = sc.nextInt();
        // 崖の位置
        double t = sc.nextInt() + 0.1;
        
        if ((n * k) < t) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }

        sc.close();
    }
}

package JoukenBunki;

import java.util.Scanner;

//高さH、幅Wの箱( 0 ≦ H, W ≦ 10^9 )があります。
//この箱を 1 つ以上の高さ 2 、幅 2 の四角いタイルで敷き詰めます。
//箱に隙間なくタイルを敷き詰めることはできますか？
//
//入力される値
//
//H W
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//期待する出力
//
//箱に隙間なくタイルを敷き詰めることができる場合はYESを、そうではない場合はNOを出力してください。
//末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//YES
//
//または
//
//NO

public class Subject24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        if (h != 0 && w != 0 && h % 2 == 0 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

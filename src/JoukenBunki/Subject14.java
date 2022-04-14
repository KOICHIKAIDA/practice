package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//ある月の 1 日は日曜日、 2 日は月曜日...です。X日は何曜日でしょう。
//
//入力される値
//
//  X
//
//入力値最終行の末尾に改行が１つ入ります。
//文字列は標準入力から渡されます。
//
//期待する出力
//
//答えとなる曜日Sを短縮した表記で出力してください。具体的に、日曜日の場合はSun、月曜日の場合はMon、火曜日の場合はTue、水曜日の場合はWed、木曜日の場合はThu、金曜日の場合はFri、土曜日の場合はSatを出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//S
//
//入力例1
//
//  1
//
//出力例1
//
//  Sun
//
//入力例2
//
//  11
//
//出力例2
//
//  Wed

public class Subject14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 7 == 1) {
            System.out.println("Sun");
        } else if (x % 7 == 2) {
            System.out.println("Mon");
        } else if (x % 7 == 3) {
            System.out.println("Tue");
        } else if (x % 7 == 4) {
            System.out.println("Wed");
        } else if (x % 7 == 5) {
            System.out.println("Thu");
        } else if (x % 7 == 6) {
            System.out.println("Fri");
        } else {
            System.out.println("Sat");
        }

        sc.close();
    }
}

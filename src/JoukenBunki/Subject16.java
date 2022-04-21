package JoukenBunki;

import java.util.Scanner;
import java.util.regex.Pattern;

//整数Nが与えられます。
//Nが 3 で割り切れる場合はFizz、Nが 5 で割り切れる場合はBuzz、 Nが 3 と 5 の両方で割り切れる場合はFizzやBuzzの代わりにFizzBuzzを出力してください。
//ただし、Nが 3 の倍数でも 5 の倍数でもないときはNをそのまま出力してください。
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
//答えとなる文字列または入力値Nを出力してください。
//末尾に改行を入れ、余計な文字、空行を含んではいけません。
//
//Fizz
//
//
//または
//
//Buzz
//
//または
//
//FizzBuzz
//
//または
//
//N

public class Subject16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (N % 3 == 0) {
            System.out.println("Fizz");
        } else if (N % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(N);
        }

        sc.close();
    }
}

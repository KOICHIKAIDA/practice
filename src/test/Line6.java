package test;

import java.util.Scanner;

//整数 n と、数列 a_1, ... , a_n と、整数 k が与えられます。
//数列に含まれる数のうち、k 番目に大きいものを出力してください。

public class Line6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力を受け取る
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // 答えを保存する変数 maximum を用意して適切な初期値で初期化
        int maximum = 1000000001;

        // k回まわるループを書いて
        for (int i = 0; i < k; i++) {
            // 数列に含まれる maximum 未満の値の最大値を保存する変数 nextMaximum を用意して適切な初期値で初期化
            int nextMaximum = -1000000001;

            // 配列の全要素をチェックするループを書いて
            for (int value : a) {
                // 未満なら nextMaximum を更新する
                if (value < maximum) {
                    // nextMaximum を更新する
                    nextMaximum = Math.max(nextMaximum, value);
                }
            }

            // maximum を更新する
            maximum = nextMaximum;
        }

        // 答えを出力する
        System.out.println(maximum);
    }
}
package test;

import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力を受け取る
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int numOfK = 0;

        for (int value : a) {
            if (value == k) {
                // 答えをインクリメントする
                numOfK++;
            }
        }

        System.out.println(numOfK);
    }
}

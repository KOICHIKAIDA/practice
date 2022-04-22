package test;

import java.util.Scanner;

public class Line5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力を受け取る
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int numOfK = 0;
        int lastNum = 0;

        for (int value : a) {
            if (value % 2 == 1) {
				lastNum = numOfK;
                numOfK++;
            } else {
                numOfK++;
            }
        }


            System.out.println(lastNum + 1);
    }
}

package test;

import java.util.Scanner;

public class Line3 {
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
        int lastNum = 0;

        for (int value : a) {
            if (value == k) {
            	lastNum = numOfK;
                numOfK++;
            } else {
                numOfK++;
            }
        }

        if (lastNum == 0) {
            System.out.println(0);
        } else {
            System.out.println(lastNum + 1);
        }
    }
}

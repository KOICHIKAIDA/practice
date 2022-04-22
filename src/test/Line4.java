package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Line4 {
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
        List<Integer> hit = new ArrayList<Integer>();

        for (int value : a) {
            if (value == k) {
            	hit.add(numOfK + 1);
                numOfK++;
            } else {
                numOfK++;
            }
        }

        for (int i : hit) {
        	System.out.println(i);
        }
    }
}

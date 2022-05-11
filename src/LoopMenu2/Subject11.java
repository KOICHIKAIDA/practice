package LoopMenu2;

import java.util.Scanner;

public class Subject11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
        	a[i] = sc.nextInt() + (i + 1);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
        	if (max < a[i]) {
        		max = a[i];
        	}
        }

        System.out.println(max);
        sc.close();
    }
}

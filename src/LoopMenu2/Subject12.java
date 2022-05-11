package LoopMenu2;

import java.util.Scanner;

public class Subject12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
        	a[i] = sc.nextInt() + (i + 1);
        }

        int min = 1000;
        for (int i = 0; i < n; i++) {
        	if (min > a[i]) {
        		min = a[i];
        	}
        }

        System.out.println(min);
        sc.close();
    }
}

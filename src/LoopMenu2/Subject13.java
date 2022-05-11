package LoopMenu2;

import java.util.Scanner;

public class Subject13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
        	if(a[i] == 1) {
        		System.out.println(i + 1);
        	}
        }
        sc.close();
    }
}

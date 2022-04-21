package LoopMenu1;

import java.util.Scanner;

public class Subject08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];;
        for (int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        
        int amount = 0;
        for (int i = 0; i < n; i++) {
        	amount = amount + a[i];
        }
        
        System.out.println(amount);
    }
}

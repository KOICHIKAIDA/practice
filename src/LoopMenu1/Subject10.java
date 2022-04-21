package LoopMenu1;

import java.util.Scanner;

public class Subject10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] A = new int[n];
        
        for (int i = 0; i < n; i++) {
        	A[i] = sc.nextInt();
        }
        
        int amount = 0;
        for (int i = a - 1; i <= b - 1; i++) {
        	amount = amount + A[i];
        }
        
        System.out.println(amount);
    }
}

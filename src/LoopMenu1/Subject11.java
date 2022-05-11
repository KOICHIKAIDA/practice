package LoopMenu1;

import java.util.Scanner;

public class Subject11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = n;

        for (int i = n; i > 1; i--) {
        	a = a * (n - 1) ;
        }

        System.out.println(a);
        sc.close();
    }
}

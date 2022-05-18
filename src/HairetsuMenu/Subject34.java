package HairetsuMenu;

import java.util.Scanner;

public class Subject34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        for (int i = A - 1; i <= B - 1; i++) {
        	System.out.println(a[i]);
        }
        sc.close();
    }
}

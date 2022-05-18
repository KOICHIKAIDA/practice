package HairetsuMenu;

import java.util.Scanner;

public class Subject33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        int tmp = 0;
        tmp = a[A - 1];
        a[A - 1] = a[B - 1];
        a[B - 1] = tmp;

        for (int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        }
        sc.close();
    }
}

package HairetsuMenu;

import java.util.Scanner;

public class Subject35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
       		b[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
        	System.out.println(b[i]);
        }

        sc.close();
    }
}

package HairetsuMenu;

import java.util.Scanner;

public class Subject61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
       		a[i] = sc.nextInt();
        }

        float avg = 0;
        for (int i = 0; i < n; i++) {
       		avg += a[i];
        }
        avg /= a.length;

        for (int i = 0; i < n; i++) {
        	if (a[i] >= avg) {
        		System.out.println(a[i]);
        	}
        }
        sc.close();
    }
}

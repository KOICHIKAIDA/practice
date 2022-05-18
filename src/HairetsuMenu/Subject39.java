package HairetsuMenu;

import java.util.Scanner;

public class Subject39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
       		System.out.println(a[i]);
        }
   		System.out.println(m);
        sc.close();
    }
}

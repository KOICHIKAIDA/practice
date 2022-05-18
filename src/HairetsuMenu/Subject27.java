package HairetsuMenu;

import java.util.Scanner;

public class Subject27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        int num = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == n) {
        		num = i + 1;
        	}
        }
        System.out.println(num);
        sc.close();
    }
}

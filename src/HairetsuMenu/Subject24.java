package HairetsuMenu;

import java.util.Scanner;

public class Subject24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        boolean flg = false;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == m) {
        		flg = true;
        	}
        }
        if (flg) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        sc.close();
    }
}

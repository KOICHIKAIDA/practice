package HairetsuMenu;

import java.util.Scanner;

public class Subject59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
       		a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
        	if (a[i] >= 5) {
        		System.out.println(a[i]);
        	}
        }
        sc.close();
    }
}

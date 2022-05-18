package HairetsuMenu;

import java.util.Scanner;

public class Subject38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == m) {
        		count++;
        	}
        }
   		System.out.println(count);
        sc.close();
    }
}

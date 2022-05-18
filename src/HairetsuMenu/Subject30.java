package HairetsuMenu;

import java.util.Scanner;

public class Subject30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == n) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
        sc.close();
    }
}

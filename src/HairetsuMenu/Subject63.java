package HairetsuMenu;

import java.util.Scanner;

public class Subject63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < 2; j++) {
        		a[i][j] = sc.nextInt();
        	}
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
        	ans[i] = Math.abs(2 - a[i][0]) + Math.abs(3 - a[i][1]);
        }

        for (int i = 0; i < n; i++) {
       		System.out.println(ans[i]);
        }
        sc.close();
    }
}

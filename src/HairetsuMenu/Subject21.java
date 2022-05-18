package HairetsuMenu;

import java.util.Scanner;

public class Subject21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[n][m];

        for(int i = 0; i < a.length; i++) {
        	for(int j = 0; j < a[i].length; j++) {
        		a[i][j] = sc.nextInt();
        	}
        }

       	System.out.println(a[k - 1][l - 1]);
        sc.close();
    }
}

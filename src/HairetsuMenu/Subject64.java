package HairetsuMenu;

import java.util.Scanner;

public class Subject64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int[][] x = new int[n][2];
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < 2; j++) {
        		x[i][j] = sc.nextInt();
        	}
        }

        int ans = Math.abs(x[a - 1][0] - x[b - 1][0]) + Math.abs(x[a - 1][1] - x[b - 1][1]);

        System.out.println(ans);
        sc.close();
    }
}

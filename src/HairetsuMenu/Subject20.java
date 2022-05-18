package HairetsuMenu;

import java.util.Scanner;

public class Subject20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[3][3];

        for(int i = 0; i < a.length; i++) {
        	for(int j = 0; j < a[i].length; j++) {
        		a[i][j] = sc.nextInt();
        	}
        }

       	System.out.println(a[k - 1][l - 1]);
        sc.close();
    }
}

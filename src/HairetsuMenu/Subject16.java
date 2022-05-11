package HairetsuMenu;

import java.util.Scanner;

public class Subject16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] a = new int[5][m];

        for(int i = 0; i < a.length; i++) {
        	for(int j = 0; j < a[i].length; j++) {
        		a[i][j] = sc.nextInt();
        	}
        }

        for(int i = 0; i < a.length; i++) {
        	for(int j = 0; j < a[i].length; j++) {
        		System.out.print(a[i][j]);
        		if(j != a[i].length - 1) {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
        sc.close();
    }
}

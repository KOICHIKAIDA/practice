package NijyuuLoop2;

import java.util.Scanner;

public class Subject02 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a[] = new int[n];
    	for (int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}

    	int b[][] = new int[n][n];
    	for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		b[i][j] = a[i] * a[j];
        	}
    	}

    	for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		System.out.print(b[i][j]);
        		if (j < n - 1) {
            		System.out.print(" ");
        		}
        	}
    		System.out.println();
    	}
    	sc.close();
    }
}

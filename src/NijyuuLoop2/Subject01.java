package NijyuuLoop2;

import java.util.Scanner;

public class Subject01 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int a[][] = new int[n][k];
    	for (int i = 0; i < n; i++) {
    		for (int j = 0; j < k; j++) {
    			a[i][j] = sc.nextInt();
    		}
    	}

		for (int j = 0; j < k; j++) {
	    	for (int i = 0; i < n; i++) {
	    		System.out.print(a[i][j]);
	    		if (i < n - 1) {
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
		}

    	sc.close();
    }
}

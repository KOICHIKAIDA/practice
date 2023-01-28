package NijyuuLoop;

import java.util.Scanner;

public class Subject11 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int a[] = new int[n];
    	int b[] = new int[k];

    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}

    	for(int j = 0; j < k; j++) {
    		b[j] = sc.nextInt();
    	}

    	int max = -10000;

    	for(int i = 0; i < n; i++) {
        	for(int j = 0; j < k; j++) {
        		if (max < a[i] * b[j]) {
        			max = a[i] * b[j];
        		}
        	}
    	}
    	System.out.println(max);
    	sc.close();
    }
}

package SkillCheck.C;

import java.util.Scanner;

public class C108 {

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int x[] = new int[N];

		    for (int i = 0; i < N; i++) {
		    	x[i] = sc.nextInt();
		    }
		    
		    int[][] c = new int[N][N];
		    for (int i = 0; i < N; i++) {
			    for (int j = 0; j < N; j++) {
			    	c[i][j] = sc.nextInt();
			    }
		    }
		    
		    int K = sc.nextInt();
		    int y[] = new int[K];
		    
		    for (int i = 0; i < K; i++) {
		    	y[i] = sc.nextInt();
		    }
		    
		    int amount = 0;
		    
		    for (int i : y) {
		    	amount += i;
		    }
		    
		    for (int i = 0; i < K - 1; i++) {
		    	amount += c[y[i] - 1][y[i+1] - 1];
		    }
		    amount += x[y[y.length - 1] - 1];
		    
		    System.out.println(amount);
	  }

}

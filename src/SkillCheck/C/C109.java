package SkillCheck.C;

import java.util.Scanner;

public class C109 {

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    String S[] = new String[N];
		    for (int i = 0; i < N; i++ ) {
		    	S[i] = sc.next();
		    }
		    
		    String X[] = new String[N];
		    String Y[] = new String[N];
		    
		    for(int i = 0; i < N; i++ ) {
		    	X[i] = "";
		    	Y[i] = "";
		    	for(int j = 0; j < S[i].length(); j++) {
		    		if(Character.isDigit(S[i].charAt(j))) {
		    			Y[i] = Y[i] + S[i].charAt(j);
		    		} else {
		    			X[i] = X[i] + S[i].charAt(j);
		    		}
		    	}
		    }
		    
		    System.out.println();
	  }

}

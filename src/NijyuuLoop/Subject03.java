package NijyuuLoop;

import java.util.Scanner;

public class Subject03 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

    	for(int i = 0; i < n; i++) {
            for(int j = 1; j <= 5; j++) {
            	System.out.print(i);
            	if (i != n) {
            		System.out.print(" ");
            	}
            }
    	}
    	sc.close();
    }
}

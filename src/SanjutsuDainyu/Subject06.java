package SanjutsuDainyu;

import java.util.Scanner;

public class Subject06 {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = sc.nextInt();
		    int calc1 = (A + B) * C;
		    int calc2 = (calc1 * calc1) % D;
		    System.out.println(calc2);
	  }
}

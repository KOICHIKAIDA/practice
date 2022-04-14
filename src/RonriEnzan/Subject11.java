package RonriEnzan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject11 {
	  static List<Integer> halfAdder(int a, int b){
		  List<Integer> result = new ArrayList<Integer>();
		  result.add(a &= b);
		  result.add(a ^= b);
		  return result;
	  }

	  // OR |=
	  // AMD &=
	  // XOR ^=
	  // NOTの論理演算子は~ （値の前に~をつけることによりNOT）
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = sc.nextInt();
		    int NOTA = ~A;
		    int NOTB = ~B;
		    int NOTAandNOTB = (NOTA &= NOTB);
		    int NOTAandNOTBorNOTC = (NOTAandNOTB |= ~C);
		    int NOTNOTAandNOTBorC = ~NOTAandNOTBorNOTC;
		    System.out.println(NOTNOTAandNOTBorC ^= D);
	  }
}

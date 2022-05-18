package HairetsuMenu;

import java.util.Scanner;

public class Subject19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[][]
        		{{1, 2, 3, 4},
	        	{10, 100, 0, 5},
	        	{8, 1, 3, 8},
	        	{15, 34, 94, 25}};

       	System.out.println(a[k - 1][l - 1]);
        sc.close();
    }
}

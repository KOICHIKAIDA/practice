package HairetsuMenu;

import java.util.Scanner;

public class Subject23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[] {5, 12, 6, 84, 14, 25, 44, 3, 7, 20};

        boolean flg = false;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == n) {
        		flg = true;
        	}
        }
        if (flg) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        sc.close();
    }
}

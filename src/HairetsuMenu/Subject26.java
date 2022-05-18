package HairetsuMenu;

import java.util.Scanner;

public class Subject26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[] {1, 5, 9, 7, 3, 2, 4, 8, 6, 10};

        int num = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == n) {
        		num = i + 1;
        	}
        }
        System.out.println(num);
        sc.close();
    }
}

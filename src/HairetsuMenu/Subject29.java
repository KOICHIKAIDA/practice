package HairetsuMenu;

import java.util.Scanner;

public class Subject29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[] {1, 2, 5, 1, 4, 3, 2, 5, 1, 4};

        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == n) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
        sc.close();
    }
}

package HairetsuMenu;

import java.util.Scanner;

public class Subject10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        System.out.println(a[k-1]);
        sc.close();
    }
}

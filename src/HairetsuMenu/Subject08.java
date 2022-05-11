package HairetsuMenu;

import java.util.Scanner;

public class Subject08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[10];
        for(int i = 0; i < 10; i++) {
        	a[i] = sc.nextInt();
        }
        System.out.println(a[k-1]);
        sc.close();
    }
}

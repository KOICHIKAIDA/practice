package HairetsuMenu;

import java.util.Scanner;

public class Subject07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[] { 1, 3, 5, 4, 6, 2, 1, 7, 1, 5 };

        System.out.println(a[k-1]);
        sc.close();
    }
}

package HairetsuMenu;

import java.util.Arrays;
import java.util.Scanner;

public class Subject56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k  = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
       		s[i] = sc.next();
        }
        Arrays.sort(s);
        System.out.println(s[k - 1]);
        sc.close();
    }
}

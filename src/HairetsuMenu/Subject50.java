package HairetsuMenu;

import java.util.Scanner;

public class Subject50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String[] s = new String[5];
        for (int i = 0; i < n; i++) {
       		s[i] = sc.next();
        }
        System.out.println(s[n - 1]);
        sc.close();
    }
}

package HairetsuMenu;

import java.util.Scanner;

public class Subject51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m  = sc.nextInt();
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
       		s[i] = sc.next();
        }
        System.out.println(s[n - 1]);
        sc.close();
    }
}

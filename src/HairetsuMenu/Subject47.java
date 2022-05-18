package HairetsuMenu;

import java.util.Scanner;

public class Subject47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[10];
        for (int i = 0; i < 10; i++) {
       		s[i] = sc.next();
        }

        for (int i = 0; i < s.length; i++) {
        	System.out.println(s[i]);
        }
        sc.close();
    }
}

package HairetsuMenu;

import java.util.Arrays;
import java.util.Scanner;

public class Subject54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        for (int i = 0; i < 5; i++) {
       		s[i] = sc.next();
        }
        Arrays.sort(s);
        for (int i = 0; i < 5; i++) {
            System.out.println(s[i]);
        }
        sc.close();
    }
}

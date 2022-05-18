package HairetsuMenu;

import java.util.Scanner;

public class Subject49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[] {"good", "morning", "paiza", "813", "pa13"};
        int n  = sc.nextInt();
        System.out.println(str[n - 1]);
        sc.close();
    }
}

package HairetsuMenu;

import java.util.Scanner;

public class Subject04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];
        for(int i = 0; i < 10; i++) {
        	n[i] = sc.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        sc.close();
    }
}

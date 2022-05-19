package HairetsuMenu;

import java.util.Scanner;

public class Subject65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int f0 = 0;
        int f1 = 1;

        System.out.println(f0);
        System.out.println(f1);

        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
        	ans = f0 + f1;
            System.out.println(ans);

        	f0 = f1;
        	f1 = ans;
        }

        sc.close();
    }
}

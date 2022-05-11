package LoopMenu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> yakusu = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		yakusu.add(i);
        	}
        }

        for (int i : yakusu) {
            System.out.println(i);
        }

        sc.close();
    }
}

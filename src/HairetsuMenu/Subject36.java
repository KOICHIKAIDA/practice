package HairetsuMenu;

import java.util.Scanner;

public class Subject36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
       		a[i] = sc.nextInt();
        }

        for(int i = 0; i < a.length - 1; i++) {
        	int min = i;
        	for (int j = i + 1; j < a.length; j++) {
        		if(a[j] < a[min]) {
        			min = j;
        		}
        	}
        	int temp = a[i];
        	a[i] = a[min];
        	a[min] = temp;
        }

        for (int i = 0; i < a.length; i++) {
       		System.out.println(a[i]);
        }
        sc.close();
    }
}

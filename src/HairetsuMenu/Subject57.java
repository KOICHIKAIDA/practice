package HairetsuMenu;

import java.util.Arrays;

public class Subject57 {
    public static void main(String[] args) {
    	int[] a = new int[] {1, 3, 5, 1, 2, 3, 6, 6, 5, 1, 4};
    	Arrays.sort(a);

    	int tmp = 0;
    	for (int i: a) {
    		if (tmp != i) {
    			System.out.println(i);
    			tmp = i;
    		}
    	}
    }
}

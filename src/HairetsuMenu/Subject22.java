package HairetsuMenu;

public class Subject22 {
    public static void main(String[] args) {
        int[] a = new int[] {10, 13, 21, 1, 6, 51, 10, 8, 15, 6};

        boolean flg = false;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == 6) {
        		flg = true;
        	}
        }
        if (flg) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}

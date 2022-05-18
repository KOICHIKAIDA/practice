package HairetsuMenu;

public class Subject25 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};

        int num = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == 8) {
        		num = i + 1;
        	}
        }
        System.out.println(num);
    }
}

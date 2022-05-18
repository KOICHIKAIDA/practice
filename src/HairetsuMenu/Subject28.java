package HairetsuMenu;

public class Subject28 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 2, 1, 2, 1, 2, 1, 1, 1};

        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
        	if (a[i] == 1) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
    }
}

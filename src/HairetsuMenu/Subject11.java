package HairetsuMenu;

public class Subject11 {
    public static void main(String[] args) {
        int[][] a = new int[][]
        		{{6, 5, 4, 3, 2, 1},
        		 {3, 1, 8, 8, 1, 3}};

        for(int i = 0; i < a.length; i++) {
        	for(int j = 0; j < a[i].length; j++) {
        		System.out.print(a[i][j]);
        		if (j != a[i].length - 1) {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
    }
}

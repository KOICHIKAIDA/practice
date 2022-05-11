package HairetsuMenu;

public class Subject15 {
    public static void main(String[] args) {
        int[][] a = new int[][]
        		{{1, 3, 5, 7},
        		{8, 1, 3, 8}};

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

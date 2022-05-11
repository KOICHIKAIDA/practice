package Sort;

/*
 * バブルソート
 */

public class BubbleSort {
	public static void main(String[] args) {
		int[] data = {30, 60, 70, 90, 20};
		sort(data);
		for(int element : data) {
			System.out.print(element + " ");
		}
	}
	
	// 数値配列のバブルソート
	public static void sort(int[] data) {
		for(int i = data.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(data[j] > data[j + 1]) {
					int tmp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = tmp;
				}
			}
		}

	}
	// 1回目ソート 30 60 70 90 20
	// 2回目ソート 30 60 70 20 90
	// 3回目ソート 30 60 20 70 90
	// 4回目ソート 30 20 60 70 90
	// 5回目ソート 20 30 60 70 90
}
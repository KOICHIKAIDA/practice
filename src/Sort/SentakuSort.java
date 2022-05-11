package Sort;

/*
 * 選択ソート
 */

public class SentakuSort {
	public static void main(String[] args) {
		int[] data = {30, 60, 70, 90, 20};
		sort(data);
		for(int element : data) {
			System.out.print(element + " ");
		}
	}
	
	// 数値配列の選択ソート
	public static void sort(int[] data) {
		for(int i = 0; i < data.length - 1; i++) {
			// i番目の値を最小値と仮定
			int min = i;
			// 最小値の探索
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] < data[min]) {
					min = j;
				}
			}
			// 最小値の入れ替え i番目の値と、i番目～末尾の値の中で一番小さい値を入れ替える
			int temp = data[i];
			data[i] = data[min];
			data[min] = temp;
		}
		// 1回目ソート 30 60 70 90 20
		// 2回目ソート 20 60 70 90 30
		// 3回目ソート 20 30 70 90 60
		// 4回目ソート 20 30 60 90 70
		// 5回目ソート 20 30 60 70 90
	}
}
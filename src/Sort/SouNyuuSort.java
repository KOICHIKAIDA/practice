package Sort;

/*
 * 挿入ソート
 */

public class SouNyuuSort {
	public static void main(String[] args) {
		int[] data = {30, 70, 60, 50, 20};
		sort(data);
		for(int element : data) {
			System.out.print(element + " ");
		}
	}
	
	// 数値配列の挿入ソート
	public static void sort(int[] data) {
		for(int i = 1; i < data.length; i++) {
			// 比較用の値（１つ前の要素より値が小さければ入れ替え処理を行う）
			int tmp = data[i];
			int j = i;
			// 入れ替え処理
			//（前後の値を比較して右辺が左辺より大きければ値を入れかえる。それを最初の要素まで繰り返す）
			while(j > 0 && tmp < data[j - 1]) {
				data[j] = data[j - 1];
				j--;
			}
			// 最小値の置き換え
			data[j] = tmp;
		}
		// 1回目ソート 30 70 60 50 20
		// 2回目ソート 30 60 70 50 20
		// 3回目ソート 30 50 60 70 20
		//                      20 70
		//                   20 60
		//                20 50
		//             20 30
		// 4回目ソート 20 30 50 60 70
	}
}
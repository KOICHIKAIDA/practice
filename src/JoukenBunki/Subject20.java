package JoukenBunki;

import java.util.Scanner;

//長さ N の数列Aが与えられます。 1 つ目の要素から最も左にある奇数の要素の手前までの値の和を求めてください。

public class Subject20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for (int x : a) {
            if (x % 2 == 1) {
                break;
            }
            ans += x;
        }

        System.out.println(ans);

        sc.close();
    }
}

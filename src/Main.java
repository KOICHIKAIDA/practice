import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 盤面の行数 H
        int W = sc.nextInt(); // 盤面の列数 W
        int Y = sc.nextInt(); // 石を置くマスの Y座標
        int X = sc.nextInt(); // 石を置くマスの X座標
        
        List<List<String>> banmen = new ArrayList<List<String>>();
        List<String> b = null;
        
        for (int x = 0; x < H; x++) {
        	b = new ArrayList<String>();
        	for (int y = 0; y < W; y++) {
        		b.add(".");
        	}
        	banmen.add(b);
        }
        
        for (int y = 0; y < H; y++) {
        	banmen.get(y).set(X, "*");
        }
        
        for (int x = 0; x < W; x++) {
        	banmen.get(Y).set(x, "*");        	
        }
        
        // 石の座標を"!"に
        banmen.get(Y).set(X, "!");
        
        for (int x = 0; x < H; x++) {
        	for (int y = 0; y < W; y++) {
        		System.out.print(banmen.get(y).get(x));
        	}
        	System.out.println();
        }
        
        
    }
}

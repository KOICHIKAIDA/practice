package NijyuuLoop2;

import java.util.Scanner;

public class Subject03 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int count = 0;

        for(int i = 2; i <= n; i++){
            boolean prime = true;
            for (int j = 2;j * j <= i; j++){
                if(i % j==0){
                    prime = false;
                    break;
                }
            }

            if(prime){
                count++;
            }
        }

    	System.out.println(count);

    	sc.close();
    }
}

package ss5_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            int factorial = 1;

            for(int j = 1; j <= (2 * i - 1); j++){
                factorial *= j;
            }
            sum += 1.0 / factorial;
        }
        System.out.print("Tổng S = " + sum);
    }
}

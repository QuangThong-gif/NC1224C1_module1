package ss5_loop;

import java.util.Scanner;

public class PrintSeriesOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        int x = 1;
        while (x <= n) {
            System.out.print(x + " ");
            x = 2 * x + 1;
        }
    }
}

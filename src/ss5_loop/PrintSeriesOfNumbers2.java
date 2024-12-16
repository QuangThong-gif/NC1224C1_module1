package ss5_loop;

import java.util.Scanner;

public class PrintSeriesOfNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        int x = 1, y = 1;
        while (x <= n) {
            System.out.println(x * y + " ");
            x = x * 2 + 1;
            y = -y;
        }
    }
}

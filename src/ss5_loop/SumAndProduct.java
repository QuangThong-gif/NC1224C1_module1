package ss5_loop;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
        System.out.println("Tích các chữ số là: " + product);
    }
}

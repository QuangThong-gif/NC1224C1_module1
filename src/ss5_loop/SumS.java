package ss5_loop;

import java.util.Scanner;

public class SumS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n là số nguyên dương: ");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / i;
        }
        System.out.print("Tổng S= " + sum);
    }
}

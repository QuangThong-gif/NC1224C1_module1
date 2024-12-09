package ss3_java_overview;

import java.util.Scanner;

public class CalculateIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int sum = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = a / (double)b;

        System.out.println("Tổng hai số nguyên: " + sum);
        System.out.println("Hiệu hai số nguyên: " + hieu);
        System.out.println("Tích hai số nguyên: " + tich);
        System.out.println("Thương hai số nguyên: " + thuong);
    }
}

package ss3_java_overview;

import java.util.Scanner;

public class CalculateTheNumberOfNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập biển số xe của bạn: ");
        int n = sc.nextInt();

        int sum = n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n;

        int soNut = sum % 10;
        System.out.println("Số nút = " + soNut);
    }
}

package ss3_java_overview;

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm sinh của bạn: ");
        int year = scanner.nextInt();

        //Tinh tuoi
        int age = 2024 - year;
        System.out.println("Tuổi hiện tại của bạn: " + age);

        //How to ... in java
    }
}

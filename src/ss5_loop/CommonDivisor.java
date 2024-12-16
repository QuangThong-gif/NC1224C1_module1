package ss5_loop;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp số nguyên x: ");
        int x = sc.nextInt();
        System.out.print("Nhập số nguyên y: ");
        int y = sc.nextInt();

        int uocChung = 1;
        for (int i = x; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                uocChung = i;
                break;
            }
        }

        int boiChung = 0; // Khởi tạo giá trị mặc định
        for (int i = x; true; i++) {
            if (i % x == 0 && i % y == 0) {
                boiChung = i;
                break;
            }
        }

        System.out.printf("Ước chung lớn nhất của %d và %d là %d", x, y, uocChung);
        System.out.printf("\nBội chung nhỏ nhất của %d và %d là %d", x, y, boiChung);
    }
}

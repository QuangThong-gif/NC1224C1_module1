package exam_module1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();

        int count = 0;

        StringBuilder soNguyenTo = new StringBuilder(); //lưu số nguyên tố
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            if (isPrime(x)) { //Ktra
                if (count > 0) {
                    soNguyenTo.append(", ");
                }
                soNguyenTo.append(x);//thêm
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Không có số nguyên tố! .");
        } else {
            System.out.println("Các số nguyên tố: " + soNguyenTo.toString());
        }
        sc.close();
    }
    public static boolean isPrime(int n) { // kiểm tra số nguyên tố
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

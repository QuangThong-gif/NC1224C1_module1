package ss3_java_overview;

import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPham = sc.nextLine();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        double tien = soLuong * donGia;
        double thue = tien * 0.1;

        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Tổng tiền: " + tien);
        System.out.println("Số thuế giá trị gia tăng: " + thue);
    }
}

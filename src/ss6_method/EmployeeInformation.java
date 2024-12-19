package ss6_method;

import java.util.Scanner;

public class EmployeeInformation {
    //Nhập và in thông tin nhân viên
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double mucLuong;
    static double diemTB;
    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }
    public static void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Họ và Tên: ");
        hoTen = sc.nextLine();

        System.out.print("Nhập ngày sinh: ");
        tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhập mức lương: ");
        mucLuong = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình: ");
        diemTB = Double.parseDouble(sc.nextLine());
    }
    public static void xuatThongTin() {
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Họ và Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Mức lương: " + mucLuong);
        System.out.println("Điểm trung bình: " + diemTB);
    }
}

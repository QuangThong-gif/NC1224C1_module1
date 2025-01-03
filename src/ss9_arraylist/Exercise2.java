package ss9_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    static Scanner nhapScanner = new Scanner(System.in);
    static ArrayList<String> danhSachTenNhanVien = new ArrayList<>();
    static ArrayList<Integer> danhSachTuoiNhanVien = new ArrayList<>();
    static ArrayList<Integer> danhSachGioiTinhNhanVien = new ArrayList<>();
    static ArrayList<Double> danhSachLuongNhanVien = new ArrayList<>();
    static ArrayList<Double> danhSachDiemTrungBinhNhanVien = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("Nhập số lượng nhân viên cần thêm: ");
        int tongSoNhanVien = Integer.parseInt(nhapScanner.nextLine());

        nhapChiTiet(danhSachTenNhanVien, danhSachTuoiNhanVien, danhSachGioiTinhNhanVien, danhSachLuongNhanVien, danhSachDiemTrungBinhNhanVien, tongSoNhanVien);
        hienThiChiTiet(danhSachTenNhanVien, danhSachTuoiNhanVien, danhSachGioiTinhNhanVien, danhSachLuongNhanVien, danhSachDiemTrungBinhNhanVien);
    }

    public static void nhapChiTiet(ArrayList<String> danhSachTenNhanVien, ArrayList<Integer> danhSachTuoiNhanVien, ArrayList<Integer> danhSachGioiTinhNhanVien, ArrayList<Double> danhSachLuongNhanVien, ArrayList<Double> danhSachDiemTrungBinhNhanVien, int tongSoNhanVien) {
        for (int i = 0; i < tongSoNhanVien; i++) {
            System.out.printf("======== Nhập thông tin cho nhân viên %d ======== ", i + 1);
            System.out.printf("\nNhập tên nhân viên %d: ", i + 1);
            danhSachTenNhanVien.add(nhapScanner.nextLine());

            System.out.printf("Nhập tuổi nhân viên %d: ", i + 1);
            danhSachTuoiNhanVien.add(Integer.parseInt(nhapScanner.nextLine()));

            int gioiTinh;
            do {
                System.out.printf("Chọn giới tính nhân viên %d \n1. Nam\n2. Nữ\n3. Khác \nLựa chọn của bạn: ", i + 1);
                gioiTinh = Integer.parseInt(nhapScanner.nextLine());
                if (gioiTinh > 3 || gioiTinh < 1) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (gioiTinh > 3 || gioiTinh < 1);
            danhSachGioiTinhNhanVien.add(gioiTinh);

            System.out.printf("Nhập mức lương nhân viên %d: ", i + 1);
            danhSachLuongNhanVien.add(Double.parseDouble(nhapScanner.nextLine()));

            double diemTrungBinh;
            do {
                System.out.printf("Nhập điểm trung bình của nhân viên %d: ", i + 1);
                diemTrungBinh = Double.parseDouble(nhapScanner.nextLine());
                if (diemTrungBinh < 0 || diemTrungBinh > 10) {
                    System.out.println("Điểm trung bình không hợp lệ, vui lòng nhập lại!");
                }
            } while (diemTrungBinh < 0 || diemTrungBinh > 10);
            danhSachDiemTrungBinhNhanVien.add(diemTrungBinh);
        }
    }

    public static void hienThiChiTiet(ArrayList<String> danhSachTenNhanVien, ArrayList<Integer> danhSachTuoiNhanVien, ArrayList<Integer> danhSachGioiTinhNhanVien, ArrayList<Double> danhSachLuongNhanVien, ArrayList<Double> danhSachDiemTrungBinhNhanVien) {
        System.out.println("============ Danh sách nhân viên ============ ");
        for (int i = 0; i < danhSachTenNhanVien.size(); i++) {
            System.out.printf("====== Nhân viên %d ======", i + 1);
            System.out.println("\nTên: " + danhSachTenNhanVien.get(i));
            System.out.println("Tuổi: " + danhSachTuoiNhanVien.get(i));
            System.out.println("Giới tính: " + (danhSachGioiTinhNhanVien.get(i) == 1 ? "Nam" : danhSachGioiTinhNhanVien.get(i) == 2 ? "Nữ" : "Khác"));
            System.out.println("Lương: " + danhSachLuongNhanVien.get(i));
            System.out.println("Điểm trung bình: " + danhSachDiemTrungBinhNhanVien.get(i));
        }
    }
}

package ss9_arraylist;

import java.util.*;

public class Exercise3 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> danhSachTenNhanVien = new ArrayList<>();
    static ArrayList<Integer> danhSachTuoiNhanVien = new ArrayList<>();
    static ArrayList<Integer> danhSachGioiTinhNhanVien = new ArrayList<>();
    static ArrayList<Double> danhSachLuongNhanVien = new ArrayList<>();
    static ArrayList<Double> danhSachDiemTrungBinhNhanVien = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("Nhập số lượng nhân viên cần thêm: ");
        int soLuongNhanVien = scanner.nextInt();

        nhapThongTinNhanVien(soLuongNhanVien);
        System.out.println("============ Danh sách nhân viên ============ ");
        for (int i = 0; i < soLuongNhanVien; i++) {
            xuatThongTinNhanVien(i);
        }

        int viTriCaoNhat = timDiemTrungBinhCaoNhat(danhSachDiemTrungBinhNhanVien);
        System.out.println("==========================================");
        System.out.println("Nhân viên có điểm trung bình cao nhất là: ");
        xuatThongTinNhanVien(viTriCaoNhat);

        System.out.println("==========================================");
        System.out.print("Nhập tên nhân viên cần tìm: ");
        scanner.nextLine();
        String tenNhanVien = scanner.nextLine();
        timNhanVienTheoTen(tenNhanVien);

        sapXepTheoTuoi();
        System.out.println("==========================================");
        System.out.println("Danh sách nhân viên sắp xếp theo tuổi: ");
        for (int i = 0; i < soLuongNhanVien; i++) {
            xuatThongTinNhanVien(i);
        }
    }

    public static void nhapThongTinNhanVien(int soLuong) {
        for (int i = 0; i < soLuong; i++) {
            System.out.printf("======== Nhập thông tin cho nhân viên %d ========\n", i + 1);
            System.out.printf("Nhập tên nhân viên %d: ", i + 1);
            scanner.nextLine(); // Xóa ký tự xuống dòng thừa
            danhSachTenNhanVien.add(scanner.nextLine());

            System.out.printf("Nhập tuổi nhân viên %d: ", i + 1);
            danhSachTuoiNhanVien.add(Integer.parseInt(scanner.nextLine()));

            int gioiTinh;
            do {
                System.out.printf("Chọn giới tính nhân viên %d\n1. Nam\n2. Nữ\n3. Khác\nLựa chọn của bạn: ", i + 1);
                gioiTinh = Integer.parseInt(scanner.nextLine());
                if (gioiTinh < 1 || gioiTinh > 3) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (gioiTinh < 1 || gioiTinh > 3);
            danhSachGioiTinhNhanVien.add(gioiTinh);

            System.out.printf("Nhập mức lương của nhân viên %d: ", i + 1);
            danhSachLuongNhanVien.add(Double.parseDouble(scanner.nextLine()));

            double diemTrungBinh;
            do {
                System.out.printf("Nhập điểm trung bình của nhân viên %d: ", i + 1);
                diemTrungBinh = Double.parseDouble(scanner.nextLine());
                if (diemTrungBinh < 0 || diemTrungBinh > 10) {
                    System.out.println("Điểm trung bình không hợp lệ, vui lòng nhập lại!");
                }
            } while (diemTrungBinh < 0 || diemTrungBinh > 10);
            danhSachDiemTrungBinhNhanVien.add(diemTrungBinh);
        }
    }

    public static void xuatThongTinNhanVien(int viTri) {
        System.out.printf("====== Nhân viên %d ======\n", viTri + 1);
        System.out.println("Tên: " + danhSachTenNhanVien.get(viTri));
        System.out.println("Tuổi: " + danhSachTuoiNhanVien.get(viTri));
        System.out.println("Giới tính: " + (danhSachGioiTinhNhanVien.get(viTri) == 1 ? "Nam" : danhSachGioiTinhNhanVien.get(viTri) == 2 ? "Nữ" : "Khác"));
        System.out.println("Lương: " + danhSachLuongNhanVien.get(viTri));
        System.out.println("Điểm trung bình: " + danhSachDiemTrungBinhNhanVien.get(viTri));
    }

    public static int timDiemTrungBinhCaoNhat(ArrayList<Double> danhSachDiem) {
        double diemCaoNhat = danhSachDiem.get(0);
        int viTriCaoNhat = 0;
        for (int i = 1; i < danhSachDiem.size(); i++) {
            if (danhSachDiem.get(i) > diemCaoNhat) {
                diemCaoNhat = danhSachDiem.get(i);
                viTriCaoNhat = i;
            }
        }
        return viTriCaoNhat;
    }

    public static void timNhanVienTheoTen(String ten) {
        for (int i = 0; i < danhSachTenNhanVien.size(); i++) {
            if (danhSachTenNhanVien.get(i).equalsIgnoreCase(ten)) {
                xuatThongTinNhanVien(i);
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên.");
    }

    public static void sapXepTheoTuoi() {
        for (int i = 0; i < danhSachTuoiNhanVien.size() - 1; i++) {
            for (int j = i + 1; j < danhSachTuoiNhanVien.size(); j++) {
                if (danhSachTuoiNhanVien.get(i) > danhSachTuoiNhanVien.get(j)) {
                    Collections.swap(danhSachTuoiNhanVien, i, j);
                    Collections.swap(danhSachTenNhanVien, i, j);
                    Collections.swap(danhSachGioiTinhNhanVien, i, j);
                    Collections.swap(danhSachLuongNhanVien, i, j);
                    Collections.swap(danhSachDiemTrungBinhNhanVien, i, j);
                }
            }
        }
    }
}

package ss3_java_overview;

import java.util.Scanner;

public class CalculateAverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào điểm Toán: ");
        double diemToan = sc.nextDouble();
        System.out.print("Nhập hiệu số điểm Toán: ");
        double hsToan = sc.nextDouble();

        System.out.print("Nhập vào điểm Lý: ");
        double diemLy = sc.nextDouble();
        System.out.print("Nhập hiệu số điểm Lý: ");
        double hsLy = sc.nextDouble();

        System.out.print("Nhập vào điểm Hoá: ");
        double diemHoa = sc.nextDouble();
        System.out.print("Nhập hiệu số điểm hoá: ");
        double hsHoa = sc.nextDouble();

        double DTB = (((diemToan * hsToan) + (diemLy * hsLy) + (hsHoa * hsHoa)))/(hsToan + hsLy + hsHoa);
        System.out.println("Điểm trung bình: " + DTB);
    }
}

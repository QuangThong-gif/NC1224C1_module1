package exam_module1;

import java.util.Scanner;

public class Exercise2 {
    //Câu 2: Nhập từ bàn phím mảng số nguyên gồm n phần tử (n<=20).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // khởi tạo mảng số nguyên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt(); // gán i
        }

        int tongChan = 0;
        int tongLe = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) { //kiểm tra số chẵn
                tongChan = tongChan + arr[i];
            } else {
                tongLe = tongLe + arr[i];
            }
        }

        int hieu = tongChan - tongLe;
        System.out.printf("Tổng các số chẵn: %d ", tongChan);
        System.out.printf("\nTổng các số lẻ: %d ", tongLe);
        System.out.printf("\nKết quả sau khi thực hiện là : %d - %d = %d", tongChan, tongLe, hieu);
    }
}

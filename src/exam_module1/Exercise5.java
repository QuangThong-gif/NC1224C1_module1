package exam_module1;

import java.util.Scanner;

public class Exercise5 {
    // Câu 5: Tìm số lớn nhì trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // mảng nguyên n phần tử
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // gán i
        }
        int soMax = Integer.MIN_VALUE; //giá trị nhỏ nhất
        int soMax2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > soMax) { // ktra i
                soMax2 = soMax;
                soMax = arr[i];
            } else if (arr[i] > soMax2 && arr[i] < soMax) {
                soMax2 = arr[i];
            }
        }

        if(soMax2 == Integer.MIN_VALUE) {
            System.out.println("Không có số lớn nhì");
        }else {
            System.out.printf("Số lớn nhì trong mảng là: %d", soMax2);
        }
        sc.close();
    }
}

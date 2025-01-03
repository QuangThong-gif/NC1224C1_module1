package exam_module1;

import java.util.Scanner;

public class Exercise1 {
    //Câu 1: In hình * sau
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp chiều dài cạnh: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

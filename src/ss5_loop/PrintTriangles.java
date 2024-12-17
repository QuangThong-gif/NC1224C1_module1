package ss5_loop;

import java.util.Scanner;

public class PrintTriangles {
    //In các hình tam giác
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh tam giác: ");
        int n = sc.nextInt();

        //Hình a
        System.out.println("Hình a");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Hình b
        System.out.println("Hình b");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){ // in ra số lượng dấu * giảm dần
                System.out.print("*");
            }
            System.out.println();
        }

        //Hình c
        System.out.println("Hình c");
        for(int i = 1; i <= n; i++){ // hàng dọc
            for(int j = 1; j <= n - i; j++) { // In số lượng dấu cách giảm dần
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){ // In dấu * tăng dần
                System.out.print("*");
            }
            System.out.println();
        }

        //Hình d
        System.out.println("Hình d");
        for(int i = 1; i <= n; i++){ // hàng
            for(int j = 1; j <= i; j++) { // cột
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i + 1; j++){ // cột
                System.out.print("*");
            }
            System.out.println();
        }

        //Hình e
        System.out.println("Hình e");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                if(i == 1 || j == 1 || j == n - i + 1 ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Hình f
        System.out.println("Hình f");
        for(int i = 1; i <= n; i++){ // hàng dọc
            for(int j = 1; j <= n - i; j++) { // In số lượng dấu cách giảm dần
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++){ // In dấu * tăng dần
                System.out.print("*");
            }
            System.out.println();
        }

        //Hình g
        System.out.println("Hình g");
        for(int i = 1; i <= n; i++){ // hàng
            for(int j = 1; j <= i; j++) { // cột
                System.out.print(" ");
            }
            for(int j = 1; j <= (n - i + 1) * 2 - 1; j++){ // cột
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

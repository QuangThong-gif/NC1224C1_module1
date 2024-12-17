package ss5_loop;

import java.util.Scanner;

public interface PrintBoxShapes {
    //In các hình hộp bằng dấu *
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh: ");
        int n = scanner.nextInt();
        //Hình a
        System.out.println("Hình a");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Hình b
        System.out.println("Hình b");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Hình c
        System.out.println("Hình c");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

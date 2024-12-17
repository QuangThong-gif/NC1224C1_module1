package ss5_loop;

import java.util.Scanner;

public interface BoxPrint {
    //In hình hộp bằng dấu *
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

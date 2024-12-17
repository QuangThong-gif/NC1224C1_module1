package ss5_loop;

import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        //In hình sao Z
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài canh: ");
        int n = sc.nextInt();
        //Hình a
        System.out.println("Hình a");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Hình b
        System.out.println("Hình b");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == n - i + 1 ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

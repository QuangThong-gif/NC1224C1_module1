package ss5_loop;

import java.util.Scanner;

public class StarPrint2 {
    public static void main(String[] args) {
        //In hình sao N
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n || j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

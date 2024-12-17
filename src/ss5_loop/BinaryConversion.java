package ss5_loop;

import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        //Chuyển số sang nhị phân
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi: ");
        int n = sc.nextInt();

        String s = " ";
        while(n > 0){
            s = n % 2 + s;
            n = n / 2;
        }
        System.out.println(" Số nhị phân: " + s);
        //1101
    }
}

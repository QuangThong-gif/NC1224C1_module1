package ss5_loop;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
//-------------------------------------------------------
        int i = 1;
        while(i <= n){
            System.out.println(i + " ");
            i += 2;
        }
    }
}

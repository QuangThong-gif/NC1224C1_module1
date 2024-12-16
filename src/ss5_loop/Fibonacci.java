package ss5_loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số n: ");
        int n = sc.nextInt();

        int f1 = 0, f2 = 1;
        int fn = 1;

        while(fn <= n){
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}

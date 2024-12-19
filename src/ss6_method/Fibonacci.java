package ss6_method;

import java.util.Scanner;

public class Fibonacci {
    //In ra n phần tử dãy Fibonacci
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương: ");
        int n = sc.nextInt();

        System.out.printf("%d Dãy Fibonacci sau khi in", n);
        fibonacci(n);
    }
    public static int fibonacci(int n) {
        int f1 = 0, f2 = 1;
        int fn = 1;

        for (int i = 2; i <= n; i++) {
            System.out.println(fn + " ");
            f1 = f2;
            f2 = fn;
            fn = fn + f1;
        }
        return fn;
    }
}

package ss6_method;

import java.util.Scanner;

public class RepeatStatement {
    //Câu lệnh lặp 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương: ");
        int n = sc.nextInt();

        System.out.printf("a. S = 1 + 2 + ... + %d = %d ",n,posiTiveTotal(n));
        System.out.printf("\nb. S = 1 + 1^2 + ... + %d = %d ",n,totalExponent(n));
        System.out.printf("\nc. S = 1 + 1/2 + ... + 1/%d = %2f ",n,totalPart(n));
        System.out.printf("\nd. S = 1 * 2 * ... * %d = %d ",n,posiTiveInteger(n));
        System.out.printf("\ne. S = 1! + 2! + ... + %d! = %d ",n,factorial(n));
    }
    //a.
    public static int posiTiveTotal(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    //b.
    public static int totalExponent(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i * i;
        }
        return sum;
    }
    //c.
    public static double totalPart(int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += 1.0 / i;
        }
        return sum;
    }
    //d.
    public static long posiTiveInteger(int n){
        long product = 1;
        for(int i = 1; i <= n; i++){
            product *= i;
        }
        return product;
    }
    //e.
    public static long factorial(int n){
        long sum = 0;
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}

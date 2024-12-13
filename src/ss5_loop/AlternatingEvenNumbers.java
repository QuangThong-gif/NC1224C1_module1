package ss5_loop;

import java.util.Scanner;

public class AlternatingEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i += 2) {
            if(i % 4 == 0){
                System.out.println(-i + " ");
            }else
                System.out.println(i + " ");
        }
    }
}

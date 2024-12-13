package ss5_loop;

import java.util.Scanner;

public class PrintedNumberString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        int count = 0;
        int khoangCach = 1;

        for(int i = 2; i <= n; i += 2) {
            if(count == khoangCach) {
                System.out.print(-i + " ");
                count = 0;
                khoangCach++;
            }else
                System.out.print(i + " ");
                count++;
        }
    }
}

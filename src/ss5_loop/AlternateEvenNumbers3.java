package ss5_loop;

import java.util.Scanner;

public class AlternateEvenNumbers3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = in.nextInt();

//        for(int i = 2; i <= 2 * n; i += 2){
//            System.out.print(i + " ");
//        }
        //--------------------------------
        int i = 2;
        while(i <= 2 * n){
            System.out.print(i + " ");
            i += 2;
        }
    }
}

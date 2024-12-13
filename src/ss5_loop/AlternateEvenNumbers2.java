package ss5_loop;

import java.util.Scanner;

public class AlternateEvenNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

//        for(int i = 2; i <= n; i += 2){
//            if(i % 6 == 0){
//                System.out.print(-i + " ");
//            }else
//                System.out.print(i + " ");
//        }
//--------------------------------------------------

        int count = 0;

        for(int i = 2; i <= n; i += 2){
            count++;
            if(count % 3 == 0){
                System.out.print(-i + " ");
            }else
                System.out.print(i + " ");
        }
    }
}

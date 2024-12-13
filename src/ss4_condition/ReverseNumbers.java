package ss4_condition;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();
        //Cách 1
//        int temp = a;
//        a = b;
//        b = temp;
        //Cách 2:
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Số sau khi đảo");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

package ss4_condition;

import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm!");
            }else
                System.out.println("Phương trình vô nghiệm!");
        }else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x =" + x);
        }
    }
}

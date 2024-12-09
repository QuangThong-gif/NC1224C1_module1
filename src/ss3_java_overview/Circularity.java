package ss3_java_overview;

import java.util.Scanner;

public class Circularity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kinh r: ");
        double r = sc.nextDouble();

        double c = 2 * Math.PI * r;

        double d = Math.PI * Math.pow(r, 2);

        System.out.println("Chu vi của hình tròn = " + c);
        System.out.println("Diện tích của hình tròn = " + d);
    }
}

package ss3_java_overview;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IntputStudy {
    public static void main(String[] args) {
        //Tieu chuan de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp vào tên của bạn: ");
        String name = scanner.nextLine();
        System.out.print("Nhập vào tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

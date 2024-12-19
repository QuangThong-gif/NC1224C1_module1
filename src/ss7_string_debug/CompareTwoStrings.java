package ss7_string_debug;

import java.util.Scanner;

public class CompareTwoStrings {
    // So sánh chuỗi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        int x = a.compareTo(b);
        if(x < 0){
            System.out.println("a < b");
        }else if(x == 0){
            System.out.println("a == b");
        }{
            System.out.println("a > b");
        }
    }
}

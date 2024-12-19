package ss7_string_debug;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";

        System.out.println("a. Lấy ra chữ World: " + str.substring(6));
        System.out.println("b. Thay thế o thành f: " + str.replace('o','f'));
        //c. Đếm xem có bao nhiêu chữ l
        //Cách 1
//        int number = str.length() - str.replace("l", "").length();
//        System.out.println(number);
        //Cách 2
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.printf("\nc. Có %d chữ l", count);
        //d. Vị trí đầu cuối cửa chữ l
        System.out.println("\nd. Vị trí xuất hiện đầu tiên: " + str.indexOf('l'));
        System.out.println("Vị trí xuất hiện cuối cùng: " + str.lastIndexOf('l'));
        //e. Xoá hết space giữa chừng, đầu và cuối
        System.out.println("\ne. Xoá hết space giữa chừng, đầu và cuối: " + str.replace(" ", ""));
        //f. Xoá hết space đầu tiên và cuối cùng
        System.out.println("\nf. Xoá space đầu tiên và cuối cùng: " + str.trim());
    }
}

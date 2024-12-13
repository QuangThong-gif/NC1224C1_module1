package ss4_condition;

import java.util.Scanner;

public class EnglishNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên từ 1 đến 10: ");
        int a = sc.nextInt();

        String englishNumber;
        switch (a){
            case 1:
                englishNumber = "One";
                break;
            case 2:
                englishNumber = "Two";
                break;
            case 3:
                englishNumber = "Three";
                break;
            case 4:
                englishNumber = "Four";
                 break;
            case 5:
                englishNumber = "Five";
                 break;
            case 6:
                 englishNumber = "Six";
                 break;
            case 7:
                 englishNumber = "Seven";
                 break;
            case 8:
                 englishNumber = "Eight";
                 break;
            case 9:
                 englishNumber = "Nine";
                 break;
                 case 10:
                 englishNumber = "Ten";
                 break;
             default:
                 System.out.println("Number không hợp lệ");
        }
    }
}

package ss6_method;

import java.util.Scanner;

public class RepeatedCommands {
    public static void main(String[] args) {
        //Câu lệnh lặp 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        System.out.printf("a. Số đảo %d : %d", n, soDao(n));
        if(soDoiXung(n)){
            System.out.printf("\nb. %d là số đối xứng!", n);
        }else{
            System.out.printf("\nb. %d không phải là số đối xứng!", n);
        }
        if(soChinhPhuong(n)){
            System.out.printf("\nc. %d là số chính phương!", n);
        }else{
            System.out.printf("\nc. %d không phải là số chính phương!", n);
        }
        System.out.printf("\ng. Tổng các số chính phương %d = %d",n , tongSoChinhPhuong(n));
    }
    //a. Trả về số đảo của số đó
    public static int soDao(int a){
        int soDao = 0;
        while(a != 0){
            int x = a % 10;
            soDao = soDao * 10 + x;
            a = a / 10;
        }
        return soDao;
    }
    //b. Số đối xứng
    public static boolean soDoiXung(int a){
        return a == soDao(a);
    }
    //c. Số chính phương
    public static boolean soChinhPhuong(int a){
        return Math.sqrt(a) % 1 == 0;
    }
    //d. Số nguyên tố
    public static boolean soNguyenTo(int a){
        if(a < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    //g. Tổng các chữ số chính phương
    public static int tongSoChinhPhuong(int a){
        int x = 0;
        while(a != 0){
            int y = a % 10;
            if(soChinhPhuong(y)){
                x = x + y;
            }
            a = a / 10;
        }
        return x;
    }
}

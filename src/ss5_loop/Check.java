package ss5_loop;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        // Kiểm tra
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        //a. Kiểm tra số đối xứng
        String s = Integer.toString(n);
        boolean isSymmetric = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isSymmetric = false;
                break;
            }
        }
        if(isSymmetric){
            System.out.printf("a. Số %d là số đối xứng!", n);
        }else{
            System.out.println("a. Không phải là số đối xứng!");
        }
        //b. Kiểm tra số nguyên tố
        boolean isPrime = true;
        if(n < 2){
            isPrime = false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.printf("b. Số %d là số nguyên tố!", n);
        }else{
            System.out.println("b. Không phải là số nguyên tố!");
        }
        //c. Các chữ số có tăng dần không
        boolean isIncrease = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) >= s.charAt(i + 1)) {
                isIncrease = false;
                break;
            }
        }
        if(isIncrease){
            System.out.printf("c. Các số %d là các số tăng dần!", n);
        }else{
            System.out.println("c. Không tăng dần!");
        }
    }
}

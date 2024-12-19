package ss6_method;

import java.util.Scanner;

public class CommonConventionMax {
    //Tìm ước chung lớn nhất
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên x: ");
        int x = sc.nextInt();
        System.out.print("Nhập số nguyên y: ");
        int y = sc.nextInt();

        System.out.printf("Ước chung lớn nhất của hai số %d và %d là %d",x,y,uocCLN(x,y));
    }
    public static int uocCLN(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);

        int max = Math.max(x, y);
        int min = Math.min(x, y);
        if(max % min == 0){
            return min;
        }
        for(int i = min / 2; i >=1; i--){
            if(x % i == 0 && y % i == 0){
                return i;
            }
        }
        return 1;
    }

}

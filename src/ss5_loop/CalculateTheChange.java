package ss5_loop;

import java.util.Scanner;

public class CalculateTheChange {
    public static void main(String[] args) {
        //Tính tiền thối lại
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền của món đồ khách hàng đã mua: ");
        int x = sc.nextInt();
        System.out.print("Nhập số tiền khách hàng đã trả: ");
        int y = sc.nextInt();

        int tienThoi = y - x;
        int manhGiaTien;
        for(int i = 2; i >= 0; i--){
            int heSo = (int) Math.pow(10, i);
            manhGiaTien = 5000 * heSo;
            if(tienThoi > manhGiaTien){
                System.out.printf("%d tờ %d\n", tienThoi / manhGiaTien, manhGiaTien);
                tienThoi %= manhGiaTien;
            }
            manhGiaTien = 2000 * heSo;
            if(tienThoi > manhGiaTien){
                System.out.printf("%d tờ %d\n", tienThoi / manhGiaTien, manhGiaTien);
                tienThoi %= manhGiaTien;
            }
            manhGiaTien = 1000 * heSo;
            if(tienThoi > manhGiaTien){
                System.out.printf("%d tờ %d\n", tienThoi / manhGiaTien, manhGiaTien);
                tienThoi %= manhGiaTien;
            }
        }
        System.out.println("Số tiền còn lại là: " + tienThoi);
    }
}

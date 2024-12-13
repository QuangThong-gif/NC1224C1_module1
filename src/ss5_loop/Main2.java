package ss5_loop;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score;
        do{
            System.out.print("Nhập vào điểm: ");
            score = sc.nextDouble();

            if(score < 0 || score > 10){
                System.out.print("Điểm không hợp lệ, điểm phải từ [0:10], vui lòng nhập lại: ");
            }
        }while(score < 0 || score > 10);
        System.out.println("Điểm: " + score);
    }
}

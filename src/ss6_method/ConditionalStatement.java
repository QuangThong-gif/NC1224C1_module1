package ss6_method;

import java.util.Scanner;

public class ConditionalStatement {
    // Câu lệnh điêều kiện và rẽ nhánh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a.Nhập một kí tự chữ cái in hoa: ");
        char character = sc.next().charAt(0);

        System.out.println("Kí tự sau khi chuyển từ in hoa thành thường: " + floralPrint(character));
        System.out.print("Nhập số a = ");
        double a = sc.nextDouble();
        System.out.print("Nhập số b = ");
        double b = sc.nextDouble();
        System.out.print("Nhập số c = ");
        double c = sc.nextDouble();
        System.out.print("Nhập số d = ");
        double d = sc.nextDouble();
        System.out.print("b. Kết quả: ");
        levelOneEquation(a,b);
        System.out.print("c. Kết quả: ");
        levelTwoEquation(a,b,c);
        double min = smallestValue(a,b,c,d);
        System.out.println("d. Giá trị nhỏ nhất của 4 số là = " + min);
    }
    //a. Chuyển từ kí tự in hoa thành thường
    public static char floralPrint(char c) {
        if(c >= 'A' && c <= 'Z'){
            c += 32; //Tăng giá trị ASCII lên 32
        }
        return c;
    }
    //b. Phương trình bậc 1
    public static void levelOneEquation(double a, double b) {
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm!");
            }else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }else {
            double x = - b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }
    //c. Phương trình bậc 2
    public static void levelTwoEquation(double a, double b, double c) {
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phương trình vô số nghiệm!");
                }else {
                    System.out.println("Phương trình vô nghiệm!");
                }
            }else {
                double x = - c / b;
                System.out.println("Nghiệm của phương trình là: " + x);
            }
        }else {
            double delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm!");
            }else if(delta == 0){
                double x = - b / (2 * a);
                System.out.println("Nghiệm kép của phương trình là: " + x);
            }else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Nghiệm của phương trình x1 = %f và x2 = %f", x1, x2);
            }
        }
    }
    //d.
    public static double smallestValue(double a, double b, double c, double d) {
        double min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;
    }
}

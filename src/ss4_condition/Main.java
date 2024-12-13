package ss4_condition;

public class Main {
    public static void main(String[] args) {
        double score = 6;
        if (score > 10 || score < 0) {
            System.out.println("Diem khong hop le");
        }else if (score < 5) {
            System.out.println("Yếu");
        } else if (score <= 6.5) {
            System.out.println("Trung bình");
        } else if (score <= 8.0) {
            System.out.println("Khá");
        } else
            System.out.println("Giỏi");
        }
    }

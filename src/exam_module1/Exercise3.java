package exam_module1;

import java.util.Scanner;

public class Exercise3 {
    /*Câu 3: Viết phương thức có tham số truyền vào là một chuỗi các ký tự.
    Phương thức thực hiện đếm số lượng ký tự in hoa trong chuỗi.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự: ");
        String str = sc.nextLine();

        System.out.println(demInHoa(str));
    }
    public static String demInHoa(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) { //Ktra i có kí tự in hoa k
                count++; //in hoa ++
            }
        }if (count > 0) {
            return "Số lượng ký tự in hoa: " + count;
        } else {
            return "Chuỗi không chứa ký tự in hoa !";
        }
    }
}


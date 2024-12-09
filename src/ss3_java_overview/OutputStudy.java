package ss3_java_overview;

public class OutputStudy {
    public static void main(String[] args) {
        //System.out.println("Hello");
        int a = 2;
        int b = 3;
        //Ctrl + alt + l : Format code
        //%c : Ki tu, %d: so nguyen, %f: so thuc, %s: kieu chuoi
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
}

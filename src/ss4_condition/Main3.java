package ss4_condition;

public class Main3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int max = (a>b) ? a : b;
        int min = (a<b) ? a : b;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

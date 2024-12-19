package ss8_stringbuilder_date;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");//Thay đổi giá trị
        changeData(sb);

        System.out.println(sb);
    }
    static void changeData(StringBuffer sb) {
        sb.append(" Nam");
        sb = new StringBuffer("ABC");
    }
}

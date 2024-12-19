package ss6_method;

public class Main2 {
    public static void main(String[] args) {
        int a = 2;

        changeData(a);
        System.out.println(a);

        //Tham trị : Giá trị không thay đổi khi ra khỏi hàm Java
        //Tham chiếu : Giá trị thay đổi khi ra khỏi hàm => không có trong java
    }
    public static void changeData(int x){
        x = 100;
    }
}

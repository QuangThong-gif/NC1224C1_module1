package ss5_loop;

public class SatisfyTheCondition {
    public static void main(String[] args) {
        //Các số thoã mãn điều kiện
        System.out.println("Các số thoã mãn điều kiện là: ");

        for(int n = 10; n <= 99; n++){
            int tensDigit = n / 10;//Chữ số hàng chục
            int onesDigit = n % 10;//Chữ số hàng đơn vị

            int sum = tensDigit + onesDigit;
            int product = tensDigit * onesDigit;
            if(product == 2 * sum){
                System.out.println(n);
            }
        }
    }
}

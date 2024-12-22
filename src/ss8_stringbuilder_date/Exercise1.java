package ss8_stringbuilder_date;

public class Exercise1 {
    public static void main(String[] args) {
        //Sử dụng và hiểu về String Builder
        String input = "Hello World";

        String str1 = "Hello";
        String str2 = "World";

        String a = "A";
        String b = new String("A");
        String c = "A";

        b.concat("B");
        String d = c.concat("C");


        StringBuilder builder = new StringBuilder(input);
        String result = builder.substring(6);
        builder.replace(4,5,"f");

        StringBuffer buffer = new StringBuffer(input);
        String result2 = buffer.substring(6);
        buffer.replace(4,5,"f");

        String result3 = str1 + str2;
        StringBuilder builder1 = new StringBuilder(str1);
        String result4 = builder1.toString();
        builder1.append(str2);

        StringBuilder buffer2 = new StringBuilder(str1);
        String result5 = buffer2.toString();
        buffer2.append(str2);

        StringBuilder e = new StringBuilder("E");
        e.append("F");
        StringBuffer g = new StringBuffer("G");
        g.append("H");

        System.out.println("a. Kết quả sử dụng StringBuilder = " + result);
        System.out.println("   Kết quả sử dụng StringBuffer = " + result2);

        System.out.println("b. Result using StringBuilder = " + buffer);
        System.out.println("   Result using StringBuffer = " + buffer);

        System.out.println("c. Kết quả khi sử dụng String = " + result3);
        System.out.println("   Kết quả khi sử dụng StringBuilder = " + result4);
        System.out.println("   Kết quả khi sử dụng StringBuffer = " + result5);

        System.out.println("e. Kết quả: " + a + b + c + d + e + g); // A + A + A + AE + EF + GH
    }
}

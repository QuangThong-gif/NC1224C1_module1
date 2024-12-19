package ss7_string_debug;

public class DataTypeConversion {
    //Chuyển đổi kiểu dữ liệu
    public static void main(String[] args) {
        //a. String thành int
        String s1 = "5000000";
        int a = Integer.parseInt(s1);
        //b. Int thành String
        String s2 = String.valueOf(a);
        //c. String thành long
        String s3 = "224242434343552";
        long b = Long.parseLong(s3);
        //d. Long thành String
        String d = String.valueOf(b);
        //e. String thành float
        String s4 = ("14.3f");
        float e = Float.parseFloat(s4);
        //f. Float thành string
        String f = String.valueOf(e);
        //g. String thành double
        String s5 = ("9.8D");
        double g = Double.parseDouble(s5);
        //h. double thành strinf
        String h = String.valueOf(g);
        //i. String thành short
        String i = ("100");
        Short s = Short.parseShort(i);
        //k. short thành string
        String j = String.valueOf(s);
    }
}

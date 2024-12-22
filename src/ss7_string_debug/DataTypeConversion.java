package ss7_string_debug;

public class DataTypeConversion {
    // Chuyển đổi kiểu dữ liệu
    public static void main(String[] args) {
        // a. String thành int
        String s1 = "5000000";
        int a = Integer.parseInt(s1);

        // b. Int thành String
        String s2 = String.valueOf(a);

        // c. String thành long
        String s3 = "224242434343552";
        long b = Long.parseLong(s3);

        // d. Long thành String
        String strFromLong = String.valueOf(b);

        // e. String thành float
        String s4 = "14.3";
        float e = Float.parseFloat(s4);

        // f. Float thành String
        String strFromFloat = String.valueOf(e);

        // g. String thành double
        String s5 = "9.8";
        double g = Double.parseDouble(s5);

        // h. Double thành String
        String strFromDouble = String.valueOf(g);

        // i. String thành short
        String s6 = "100";
        short s = Short.parseShort(s6);

        // k. Short thành String
        String strFromShort = String.valueOf(s);
    }
}

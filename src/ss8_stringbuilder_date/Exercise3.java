package ss8_stringbuilder_date;

public class Exercise3 {
    //ép kiểu dữ liệu
    public static void main(String[] args) {
        //a. Ép kiểu từ byte đến double
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        //b. Ép kiểu độ chính xác không thay đổi từ double đến byte
        double doubleValue2 = 100;
        float floatValue2 = (float) doubleValue2;
        long longValue2 = (long) floatValue2;
        int intValue2 = (int)longValue2;
        short shortValue2 = (short)intValue2;
        byte byteValue2 = (byte)shortValue2;

        //c.
        double doubleValue3 = 999999999.9;
        float floatValue3 = (float) doubleValue3;
        long longValue3 = (long) floatValue3;
        int intValue3 = (int)longValue3;
        short shortValue3 = (short)intValue3;
        byte byteValue3 = (byte)shortValue3;
    }
}

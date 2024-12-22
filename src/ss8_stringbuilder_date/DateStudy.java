package ss8_stringbuilder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date(1000 * 60 * 60 * 24);
//        System.out.println(date.getTime());

//        String dateFormat = "20/12/2024"; //dd/MM/yyyy
//        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
//        Date date = sdf.parse(dateFormat);
//        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(new Date()));
    }
}

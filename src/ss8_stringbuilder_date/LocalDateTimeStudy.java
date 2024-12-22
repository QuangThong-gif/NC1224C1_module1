package ss8_stringbuilder_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeStudy {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(dateTime);

//        LocalDate currentDate = LocalDate.now();
//        LocalDate date = currentDate.plusYears(-10);
//        LocalDate date = currentDate.withYear(2040);
//        System.out.println(date.getYear());
//        System.out.println(date.getMonth());
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getDayOfWeek());
//        System.out.println(date.getDayOfYear());
//        System.out.println(date.getMonthValue());
//
//        System.out.println(date.isAfter(currentDate));

        String strDate = "20/12/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(strDate, formatter);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonthValue());
    }
}

package ss8_stringbuilder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) throws ParseException {
        //a. Chuyển chuỗi "12/20/2023" sang kiểu java.util.Date.
        String dateStr = "12/20/2024";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sdf.parse(dateStr);

        /*b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date sang
        kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.*/
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(currentDate);

        //c. Chuyển chuỗi "12/20/2023" sang kiểu LocalDate.
        String dataStr1 = "12/20/2024";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(dataStr1, formatter1);

        /*d. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu LocalDate sang
        kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.*/
        LocalDate currentLocalDate = LocalDate.now();
        String formattedDate2 = formatter1.format(currentLocalDate);

        //e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
        LocalDateTime currentDateTime = LocalDateTime.now();
        int day = currentDateTime.getDayOfMonth();
        int month = currentDateTime.getMonthValue();
        int year = currentDateTime.getYear();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        int second = currentDateTime.getSecond();

        /*f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơivào thứ mấy trong tuần,
        và cách ngày hiện tại bao nhiêu ngày?*/
        LocalDate oneMonthLater = currentLocalDate.plusMonths(1);

        //g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
        LocalDate futureDate = currentLocalDate.plusDays(1000);

        /*h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy.
        Hãy chuyển thành 2 biến kiểu LocalDate.
        Sau đó hãy tính số ngày chênh lệch giữa 2 ngày đã nhập vào.*/
        String dateStr1 = "15/12/2024";
        String dateStr2 = "20/12/2024";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(dateStr1, formatter2);
        LocalDate localDate2 = LocalDate.parse(dateStr2, formatter2);
        long daysDifference = localDate1.until(localDate2, ChronoUnit.DAYS);

        /*i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy.
        Sau đó, nhập vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.*/
        int n = 10;
        LocalDate futureDate1 = futureDate.plusDays(n);

        System.out.println("a. java.util.Date " + date);

        System.out.println("b. Ngày đã định dạng: " + formattedDate);

        System.out.println("c. LocalDate " + localDate);

        System.out.println("d. Ngày đã định dạng: " + formattedDate2);

        System.out.println("e. Ngày " + day);
        System.out.println("   Tháng " + month);
        System.out.println("   Năm " + year);
        System.out.println("   Giờ " + hour);
        System.out.println("   Phút " + minute);
        System.out.println("   Giây " + second);

        System.out.println("f. Một tháng sau sẽ rơi vào thứ " + oneMonthLater.getDayOfWeek());
        long days = currentLocalDate.until(oneMonthLater, ChronoUnit.DAYS);
        System.out.println("   Một tháng sau " + oneMonthLater);
        System.out.println("   Số ngày đến một tháng sau: " + days);

        System.out.println("g. Ngày tương lai: " + futureDate);
        System.out.println("h. Số ngày chênh lệch: " + daysDifference);

        System.out.println("i. Ngày sau " + n + " ngày " + futureDate1.format(formatter2));
    }
}

// import java.util.Date;
// import java.sql.*;
import java.time.*;
public class Date {
    public static void main(String[] args) {
        java.util.Date d=new java.util.Date();
        System.out.println(d);
        long timeInMs=d.getTime();

        java.sql.Date dt=new java.sql.Date(timeInMs);
        System.out.println(dt);


        LocalDate date=LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        LocalTime time=LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);



    }
}


// javap java.util.Date  (to find all the method in  the class type this in consol.)
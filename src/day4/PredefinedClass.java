package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class PredefinedClass {

    public static void main(String[] args) {
        /*
        type of classes
        creating with new
        creating without new
        cannot create object
         */

        double random = Math.random();
        System.out.println(Math.floor(random * 10));

        int maxValue = Math.max(5,7);
        System.out.println(maxValue);


//        date localdate calender
        Date currentdate = new Date();
        System.out.println(currentdate);

        Date currentDate1 = new Date(180,2,3);
        Date currentDate2 = new Date();
        System.out.println(currentDate1.before(currentDate2));
        System.out.println(currentDate1.after(currentDate2));

//        LocalDate currentSamaya =  new LocalDate() this is wrong way to do, right way is just below this
        LocalDate currentSamaya = LocalDate.now();
        System.out.println(currentSamaya);

        LocalDateTime currentSamaya1 = LocalDateTime.now();
        System.out.println(currentSamaya1);

        LocalDate specificDate1 = LocalDate.of(2020,3,12);
        System.out.println(specificDate1);

        LocalDate specificDate2 = LocalDate.of(2022,4,23);
        System.out.println(specificDate2);

        System.out.println(specificDate1.isBefore(specificDate2));
        specificDate1.getMonth();

        Calendar now = Calendar.getInstance();
        System.out.println(now.getTime());



    }
}
package day20;

import java.util.ArrayList;
import java.util.EnumSet;

public enum EnumPractice {



    public static void main(String[] args) {
//        ArrayList<Weekdays> weekdays = new ArrayList<>();
//        weekdays.add(Weekdays.SUNDAY);
//        weekdays.add(Weekdays.MONDAY);
//        weekdays.add(Weekdays.TUESDAY);
//        weekdays.add(Weekdays.WEDNESDAY);
//        weekdays.add(Weekdays.THURSDAY);
//        weekdays.add(Weekdays.FRIDAY);
//        weekdays.add(Weekdays.SATURDAY);

//        System.out.println(weekdays);

        EnumSet<Weekdays> allDays = EnumSet.allOf(Weekdays.class);
        System.out.println(allDays);

        EnumSet<Weekdays> fewSelectedDays = EnumSet.range(Weekdays.MONDAY,Weekdays.FRIDAY);
        System.out.println(fewSelectedDays);

        EnumSet<Weekdays> specificDays = EnumSet.of(Weekdays.MONDAY,Weekdays.FRIDAY);
        System.out.println(fewSelectedDays);

        EnumSet<Weekdays> emptyDays = EnumSet.noneOf(Weekdays.class);
        System.out.println(emptyDays);
    }
}
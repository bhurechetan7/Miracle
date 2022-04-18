package com.Java8.DateTimeApi;

//Previous API was not thread safe, new version is immutable and do not have setter methods.
//New Version provides more operation than older version.
// Under package java.time

//Local : Simplified date-time API with no complexity of timezone handling.
//Zoned : Specialized date-time API to deal with various timezones.
//LocalDate/LocatTime and LocalDateTime API : Use it when time zones are NOT required.

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Demo {

     public static void localApi(){

         //current date
         LocalDate date = LocalDate.now();
         System.out.println("The Current Date : "  + date);

         //current Time
         LocalTime time = LocalTime.now();
         System.out.println("The current time is : " + time);

         //In order to get time and date
         LocalDateTime  dateTime  = LocalDateTime.now();
         System.out.println("The Date and Time is : " + dateTime);

         //to format the date and time

         DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String formatedDateTime = dateTime.format(format);

         System.out.println("in formatted manner "+
                 formatedDateTime);

         //prints months and seconds
         Month month = dateTime.getMonth();
         int day = dateTime.getDayOfMonth();
         int seconds = dateTime.getSecond();
         System.out.println("Month : "+month+" day : "+
                 day+" seconds : "+seconds);
         // printing some specified date
         LocalDate date2 = LocalDate.of(1950,1,26);
         System.out.println("the republic day :"+date2);

         // printing date with current time.
         LocalDateTime specificDate =
                 dateTime.withDayOfMonth(24).withYear(2016);

         System.out.println("specific date with "+
                 "current time : "+specificDate);

     }

    public static void main(String[] args) {

         localApi();
    }

}

// Zone Date Time API, Use it when time zones are to be considered.
 class Demo1 {

    // Java code for Zoned date-time API




        // Function to get Zoned Date and Time
        public static void ZonedTimeAndDate()
        {
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter format1 =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formattedCurrentDate = date.format(format1);

            System.out.println("formatted current Date and"+
                    " Time : "+formattedCurrentDate);

            // to get the current zone
            ZonedDateTime currentZone = ZonedDateTime.now();
            System.out.println("the current zone is "+
                    currentZone.getZone());

            // getting time zone of specific place
            // we use withZoneSameInstant(): it is
            // used to return a copy of this date-time
            // with a different time-zone,
            // retaining the instant.
            ZoneId tokyo = ZoneId.of("Asia/Tokyo");

            ZonedDateTime tokyoZone =
                    currentZone.withZoneSameInstant(tokyo);

            System.out.println("tokyo time zone is " +
                    tokyoZone);

            DateTimeFormatter format =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formatedDateTime = tokyoZone.format(format);

            System.out.println("formatted tokyo time zone "+
                    formatedDateTime);

        }

        // Driver code
        public static void main(String[] args)
        {

            ZonedTimeAndDate();

        }
    }


   /* Period and Duration classes :
        Period : It deals with date based amount of time.
        Duration : It deals with time based amount of time.*/


// Java code for period and duration


class Demo3 {

    public static void checkingPeriod()
    {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 =
                LocalDate.of(2014, Month.DECEMBER, 12);

        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates "+
                "is a period of "+gap);
    }

    // Function to check duration
    public static void checkingDuration()
    {

        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " +
                time1);

        Duration fiveHours = Duration.ofHours(5);

        // adding five hours to the current
        // time and storing it in time2
        LocalTime time2 = time1.plus(fiveHours);

        System.out.println("after adding five hours " +
                "of duration " + time2);

        Duration gap = Duration.between(time2, time1);
        System.out.println("duration gap between time1" +
                " & time2 is " + gap);
    }

    // Driver code
    public static void main(String[] args)
    {
        checkingPeriod();
        checkingDuration();
    }
}

//ChronoUnits Enum : java.time.temporal.ChronoUnit enum is added in
// Java 8 to replace integer values used in old API to represent day, month etc.

// Java code for ChronoUnits Enum


 class Demo4 {

    // Function to check ChronoUnit
    public static void checkingChronoEnum()
    {
        LocalDate date = LocalDate.now();
        System.out.println("current date is :" +
                date);

        // adding 2 years to the current date
        LocalDate year =
                date.plus(2, ChronoUnit.YEARS);

        System.out.println("next to next year is " +
                year);

        // adding 1 month to the current data
        LocalDate nextMonth =
                date.plus(1, ChronoUnit.MONTHS);

        System.out.println("the next month is " +
                nextMonth);

        // adding 1 week to the current date
        LocalDate nextWeek =
                date.plus(1, ChronoUnit.WEEKS);

        System.out.println("next week is " + nextWeek);

        // adding 2 decades to the current date
        LocalDate Decade =
                date.plus(2, ChronoUnit.DECADES);

        System.out.println("20 years after today " +
                Decade);
    }

    // Driver code
    public static void main(String[] args) {

        checkingChronoEnum();

    }
}

//TemporalAdjuster : It is used to perform various date related operations.

// Java code Temporal Adjuster


 class Demo5
{

    // Function to check date and time
    // according to our requirement
    public static void checkingAdjusters()
    {

        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+
                date);

        // to get the first day of next month
        LocalDate dayOfNextMonth =
                date.with(TemporalAdjusters.
                        firstDayOfNextMonth());

        System.out.println("firstDayOfNextMonth : " +
                dayOfNextMonth );

        // get the next saturday
        LocalDate nextSaturday =
                date.with(TemporalAdjusters.
                        next(DayOfWeek.SATURDAY));

        System.out.println("next saturday from now is "+
                nextSaturday);

        // first day of current month
        LocalDate firstDay =
                date.with(TemporalAdjusters.
                        firstDayOfMonth());

        System.out.println("firstDayOfMonth : " +
                firstDay);

        // last day of current month
        LocalDate lastDay =
                date.with(TemporalAdjusters.
                        lastDayOfMonth());

        System.out.println("lastDayOfMonth : " +
                lastDay);
    }

    // Driver code
    public static void main(String[] args)
    {

        checkingAdjusters();
    }
}

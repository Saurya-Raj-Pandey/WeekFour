import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


public class DateLibraries {

    public static void main(String[] args) {
//      Java Util
//      System.out.println(Long.MAX_VALUE );
//      System.out.println(System.currentTimeMillis()/1000/3600/24/365);// this gives the millesecods travelled from  1970
//        Date date= new Date();
//        LocalTime localTime= LocalTime.now();
//        System.out.println(localTime);
//        System.out.println(date); // this was used till previous java
//        System.out.println(date.getTime());
//        System.out.println(date.getDate());
//        System.out.println(date.getHours());
//        System.out.println(date.getTimezoneOffset());
//        System.out.println(date.getYear());  //1900-2022
//----------------------------------------------------------------------------------------
//               // This is for the Java Date
//        LocalTime localTime= LocalTime.now(); // this displays the localtime and the milisecond
//        System.out.println(localTime);
//        LocalDate localDate=LocalDate.now();//this displays the current date
//        System.out.println(localDate);
//        LocalDateTime localDateTime=LocalDateTime.now();// here we can see that the local time and date has been seperated by T
//        System.out.println("This will display T in between the seperation of Date and time : "+localDateTime);
//
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern(" H:m:s -- E  W dd-MM-yyyy");
////        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ISO_LOCAL_DATE;
//        String humanReadableDateTime=localDateTime.format(dateTimeFormatter);//By using this it formates the date into the human readable form
//        System.out.println("This removes the milliseconds and provides the human readable format : "+humanReadableDateTime);
//--------------------------------------------------------------------------------------------------------------------------------------
//        //Calender class <-- abstract class

//        Calendar c =Calendar.getInstance();
//        System.out.println(c.getCalendarType());// this displays the  calender name which we are using in our daily
//        System.out.println(c.getTimeZone());// this gives the time zone


//        Calendar c =Calendar.getInstance(); //<-- this gives the country zone of the Country you are connected to    //(TimeZone.getTimeZone("UTC -5\tEST"));<-- this gives the timezone of the  usergiven inut
//        System.out.println(c.getCalendarType());// this displays the  calender name which we are using in our daily
//        System.out.println(c.getTimeZone().getID());// this gives the time zone
//        System.out.println(c.getTime()); // displays time

//        Calendar c= Calendar.getInstance();
//        System.out.println(c.getTime());
//        System.out.println(c.get(Calendar.DATE)); // this displays the date
//        System.out.println(c.get(Calendar.SECOND)); // this displays the second
//        System.out.println(c.get(Calendar.HOUR));// this displays the Hour
//        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));// this displays what day of the week it is
//        System.out.println(c.get(Calendar.UNDECIMBER));// this is the thirteen month in the calender
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE)+ " : " + c.get(Calendar.SECOND)); // this is used to print the curren ttime
//        GregorianCalendar gregorianCalendar=new GregorianCalendar();
//        System.out.println(gregorianCalendar.isLeapYear(2024));
//-------------------------------------------------------------------------------------------------------------
// java sql date
//        long milis=System.currentTimeMillis();
//        Date date=new Date(milis);
//        System.out.println(date);// this was used to get the current date
//
//    //Converting the java string to sql date
//    String string="2022-01-28";
//    Date date1=Date.valueOf(string);// .valueof() is used when  we want to change string to the date
//        System.out.println(date1);


    // Using the void setTime()
    java.util.Date date2 = new Date();
        System.out.println("The initial date is :" + date2);

        date2.setTime(900000000);
        System.out.println("Date after setting the time is : "+ date2);

        // this is used for toLocalDate()
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(" the date is : "+localDateTime.toLocalDate());

        //this is used for the toInstant()
        Calendar calendar =Calendar.getInstance();
        calendar.set(Calendar.MONTH,0);
        calendar.set(Calendar.DATE,12);
        calendar.set(Calendar.YEAR,2022);
        Date date=calendar.getTime();
        Instant instant=date.toInstant();
        System.out.println("The original date is : "+date.toString());
        System.out.println("The instanced Date is : "+instant);

    }
}

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Time {
  public static void  main(String arg[]) {
  Calendar currentDate = Calendar.getInstance();
  SimpleDateFormat formatter= 
  new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
  String dateNow = formatter.format(currentDate.getTime());
  System.out.println("Now the date is :=>  " + dateNow);
  }
}
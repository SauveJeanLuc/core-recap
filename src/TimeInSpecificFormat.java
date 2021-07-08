import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/** Java program to display the current date time in specific format.
 * @author SAUVE Jean-Luc
 * @version 1.1
 */
public class TimeInSpecificFormat {
    public static void main(String[] args) {
        //Set format 2021-01-31 23:59:59.999
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

        //Set Timezone to GMT
        dateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        // Display the now time
        System.out.println("Time(now): "+dateFormat.format(System.currentTimeMillis()));
    }
}

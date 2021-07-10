package Basic;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/** Java program to display the current date time in specific format.
 * @author SAUVE Jean-Luc
 * @version 1.2
 */
public class TimeInSpecificFormat {

    //Used only in terminal
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //Set format 2021-01-31 23:59:59.999
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

        //Set Timezone to GMT
        dateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        // Display the now time
            System.out.println("Time(now): "+dateFormat.format(System.currentTimeMillis()));


    }
}

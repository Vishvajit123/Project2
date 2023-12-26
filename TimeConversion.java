
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) {
        // Provided time at 12-hour AM/PM format
        String time12 = "12:00:00 AM";

        // Create a DateTimeFormatter object for the provided 12-hour format
        DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        // Convert the time from the provided 12-hour format to a LocalTime object
        LocalTime localTime = LocalTime.parse(time12, formatter12);

        // Create a DateTimeFormatter object for the desired 24-hour format
        DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Convert the time from the LocalTime object to the desired 24-hour format
        String time24 = localTime.format(formatter24);

        // Print the converted time
        System.out.println("Time in 24-hour format: " + time24 );


    }
}

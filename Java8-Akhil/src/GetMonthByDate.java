import java.time.Month;
import java.time.LocalDate;

class GetMonthByDate {

    // Function to get month
    public static void
    GetMonthByDate(String date) {

        // Get an instance of LocalTime
        // from date
        LocalDate currentDate = LocalDate.parse(date);


        // Get month from date
        Month month = currentDate.getMonth();


        // Print the month

        System.out.println("Month: " + month);

    }

    // Driver Code
    public static void main(String args[]) {
        // Given Date
        String date = "2020-01-18";

        // Function Call
        GetMonthByDate(date);
    }
}



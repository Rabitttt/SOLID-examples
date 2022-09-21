package SingleResponsiblity.wrong;

import java.util.Date;

public class Hotel {
    String name;
    String stars;

    void makeReservation(String startDate, String endDate) {
        System.out.printf("Make Reservation " + startDate + " to " + endDate);
    }
}

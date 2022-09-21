package OpenClosed.wrong;

import java.util.List;

public class AvailabilityCheck {

    void checkAvailability(List<Object> reservations) {
        for (Object reservation : reservations) {
            if (reservation instanceof Hotel) {
                System.out.println("Check is Hotel available");
            }
            if (reservation instanceof Car) {
                System.out.println("Check is Car available");
            }
        }
    }
}

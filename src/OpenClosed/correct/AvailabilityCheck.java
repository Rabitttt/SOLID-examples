package OpenClosed.correct;


import OpenClosed.correct.Car;
import OpenClosed.correct.Hotel;

import java.util.List;

public class AvailabilityCheck {


    void checkAvailability(List<Availability> reservations) {
        for (Availability reservation : reservations) {
            reservation.checkAvailability();
        }
    }
}

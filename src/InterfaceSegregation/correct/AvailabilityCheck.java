package InterfaceSegregation.correct;


import java.util.List;

public class AvailabilityCheck {

    void checkAvailability(List<Availability> reservations) {
        for (Availability reservation : reservations) {
            reservation.checkAvailability();
        }
    }
}

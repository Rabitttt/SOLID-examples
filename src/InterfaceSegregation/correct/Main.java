package InterfaceSegregation.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Availability> reservations = List.of(new Car(),new Hotel());
        AvailabilityCheck availabilityCheck = new AvailabilityCheck();
        availabilityCheck.checkAvailability(reservations);
    }
}

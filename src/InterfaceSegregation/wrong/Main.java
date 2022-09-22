package InterfaceSegregation.wrong;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Availability> reservations = List.of(new Car(),new Hotel());
        AvailabilityCheck availabilityCheck = new AvailabilityCheck();

        //Interface should not force class to implement what they can't do.
        availabilityCheck.checkAvailability(reservations);
    }
}

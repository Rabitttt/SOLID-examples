package DependencyInversion.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Availability> reservations = List.of(new Car(),new Hotel());

        // We can use both AvailabilityCheck and DetailedAvailabilityCheck

        //IAvailabilityCheck availabilityCheck = new AvailabilityCheck();
        IAvailabilityCheck availabilityCheck = new AvailabilityDetailedCheck();
        availabilityCheck.checkAvailability(reservations);
    }
}

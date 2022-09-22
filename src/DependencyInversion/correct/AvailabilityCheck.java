package DependencyInversion.correct;


import java.util.List;

public class AvailabilityCheck implements IAvailabilityCheck{
    @Override
    public void checkAvailability(List<Availability> reservations) {
        for (Availability reservation : reservations) {
            reservation.checkAvailability();
        }
    }
}

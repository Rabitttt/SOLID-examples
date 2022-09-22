package DependencyInversion.correct;

import java.util.List;

public interface IAvailabilityCheck {
    void checkAvailability(List<Availability> reservations);
}

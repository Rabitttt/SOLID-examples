package LiskovSubstitution.wrong;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Availability> reservations = List.of(new Car(),new Hotel());
        AvailabilityCheck availabilityCheck = new AvailabilityCheck();
        //When 'Hotel' instance comes the code will throw exception. Because Hotel is not Substitutable by Availability Interface.
        availabilityCheck.checkAvailability(reservations);
    }
}

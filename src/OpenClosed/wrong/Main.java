package OpenClosed.wrong;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> reservations = List.of(new Car(),new Hotel());
        OpenClosed.wrong.AvailabilityCheck availabilityCheck = new AvailabilityCheck();
        availabilityCheck.checkAvailability(reservations);
    }
}
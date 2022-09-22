package InterfaceSegregation.wrong;

public class Hotel implements Availability {

    @Override
    public void checkAvailability() {
        System.out.println("Check is Car available");
    }

    @Override
    public void checkIsGasolineEnough() {
        // We cant Calculate Gasoline for Hotel...
        System.out.println("We cant Calculate Gasoline for Hotel...");
    }
}

package LiskovSubstitution.wrong;

public class Hotel implements Availability {

    @Override
    public void checkAvailability() {
        System.out.println("Check is Car available");
    }

    @Override
    public void checkIsGasolineEnough() {
        throw new IllegalStateException(
                "Cannot Check Gasoline For Hotel"
        );
    }
}

package InterfaceSegregation.wrong;

public class Car implements Availability {

    @Override
    public void checkAvailability() {
        System.out.println("Check is Hotel available");
    }

    @Override
    public void checkIsGasolineEnough() {
        System.out.println("Enough Gasoline");
    }
}

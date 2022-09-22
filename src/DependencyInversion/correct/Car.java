package DependencyInversion.correct;

public class Car implements Availability, Gasoline {

    @Override
    public void checkAvailability() {
        System.out.println("Check is Hotel available");
    }

    @Override
    public void checkIsGasolineEnough() {
        System.out.println("Enough Gasoline");
    }
}

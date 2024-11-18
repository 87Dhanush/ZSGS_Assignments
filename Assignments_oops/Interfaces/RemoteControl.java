import java.util.*;
interface RemoteControlCar {
    void drive();
    int getDistanceTravelled();
}
class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled = 0;
    private int numberOfVictories = 0;

    @Override
    public void drive() {
        distanceTravelled += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setNumberOfVictories(int victories) {
        this.numberOfVictories = victories;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
    }
}

class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled = 0;

    @Override
    public void drive() {
        distanceTravelled += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}

class TestTrack {
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}

public class RemoteControl {
    public static void main(String[] args) {
        ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
        ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();

        prod.drive();
        System.out.println("Production car distance: " + prod.getDistanceTravelled());
        exp.drive();
        System.out.println("Experimental car distance: " + exp.getDistanceTravelled());

        TestTrack.race(prod);
        TestTrack.race(exp);
        System.out.println("Production car distance after race: " + prod.getDistanceTravelled());
        System.out.println("Experimental car distance after race: " + exp.getDistanceTravelled());

        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(2);
        prc2.setNumberOfVictories(3);

        List<ProductionRemoteControlCar> cars = new ArrayList<>();
        cars.add(prc1);
        cars.add(prc2);

        List<ProductionRemoteControlCar> rankedCars = TestTrack.getRankedCars(cars);
        System.out.println("Ranked cars:");
        for (ProductionRemoteControlCar car : rankedCars) {
            System.out.println("Victories: " + car.getNumberOfVictories());
        }
    }
}

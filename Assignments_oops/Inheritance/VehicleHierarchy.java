public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("TVS", "TVS-15", 2, "Petrol");
        car.displayDetails();
        car.start();
        car.stop();

        Bike bike = new Bike("Yamaha", "MT-15", 6, true);
        bike.displayDetails();
        bike.start();
        bike.stop();

        Vehicle vehicle = new Car("Honda", "Civic", 5, "Diesel");
        vehicle.displayDetails();
        vehicle.start();
        vehicle.stop();
    }
}

class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Parent class constructor called");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    // Methods to be overridden in the child classes
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    private int seatingCapacity;
    private String fuelType;

    public Car(String brand, String model, int seatingCapacity, String fuelType) {
        super(brand, model);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
        System.out.println("Car class constructor called");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }

    public void start() {
        System.out.println("Car is starting with " + fuelType + " fuel");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

class Bike extends Vehicle {
    private int gearCount;
    private boolean hasCarrier;

    public Bike(String brand, String model, int gearCount, boolean hasCarrier) {
        super(brand, model);
        this.gearCount = gearCount;
        this.hasCarrier = hasCarrier;
        System.out.println("Bike class constructor called");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Gear Count: " + gearCount + ", Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }

    public void start() {
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }
}

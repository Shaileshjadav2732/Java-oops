package oops;

// Abstract class representing a vehicle
abstract class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Abstract method for calculating the vehicle's top speed
    public abstract double calculateTopSpeed();
}

// Concrete class representing a car
class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    // Implementing the abstract method to calculate the car's top speed
    @Override
    public double calculateTopSpeed() {
        return 120.0;
    }
}

// Concrete class representing a motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, boolean hasSidecar) {
        super(make, model);
        this.hasSidecar = hasSidecar;
    }

    public boolean getHasSidecar() {
        return hasSidecar;
    }

    // Implementing the abstract method to calculate the motorcycle's top speed
    @Override
    public double calculateTopSpeed() {
        return 150.0;
    }
}

public class vehicle_abstract {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 4);
        System.out.println("My car's make is " + myCar.getMake() + " and model is " + myCar.getModel() + ".");
        System.out.println("It has " + myCar.getNumDoors() + " doors and can go up to " + myCar.calculateTopSpeed() + " mph.");

        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Fat Boy", false);
        System.out.println("My motorcycle's make is " + myMotorcycle.getMake() + " and model is " + myMotorcycle.getModel() + ".");
        System.out.println("It " + (myMotorcycle.getHasSidecar() ? "has" : "does not have") + " a sidecar and can go up to " + myMotorcycle.calculateTopSpeed() + " mph.");
    }
}
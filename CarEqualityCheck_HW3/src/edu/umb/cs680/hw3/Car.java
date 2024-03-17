package edu.umb.cs680.hw3;

public class Car {
    private String make;
    private String model;
    private int mileage;
    private int year;
    private float price;

    public Car(String make, String model, int mileage, int year, float price) throws IllegalArgumentException {
        if (mileage < 0 || year < 1886 || price < 0.0f) {
            throw new IllegalArgumentException("Invalid car attribute values");
        }

        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public static void main(String[] args) {
        try {
            Car car1 = new Car("Kia", "Sonet", 1000, 2022, 18000.0f);
            Car car2 = new Car("Maruti", "Brezza", 30000, 2022, 22000.0f);

            // Accessing car properties using getter methods
            System.out.println("Car 1 Details:");
            System.out.println("Make: " + car1.getMake());
            System.out.println("Model: " + car1.getModel());
            System.out.println("Mileage: " + car1.getMileage() + " kms");
            System.out.println("Year: " + car1.getYear());
            System.out.println("Price: $" + car1.getPrice());

            System.out.println("\nCar 2 Details:");
            System.out.println("Make: " + car2.getMake());
            System.out.println("Model: " + car2.getModel());
            System.out.println("Mileage: " + car2.getMileage() + " kms");
            System.out.println("Year: " + car2.getYear());
            System.out.println("Price: $" + car2.getPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

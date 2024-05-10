package umbcs680.hw3;
public class Car {
    private String brand, model;
    private int distance, year;
    private float cost;

    public Car(String brand, String model, int year, int distance, float cost) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.distance = distance;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getDistance() {
        return distance;
    }

    public float getCost() {
        return cost;
    }
}

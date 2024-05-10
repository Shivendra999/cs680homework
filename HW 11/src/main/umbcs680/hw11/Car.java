package umbcs680.hw11;
public class Car {
    public String brand;
    private int cost;
    private int yearManufactured;
    private int distanceDriven;
    private int dominanceIndex;

    public Car(String brand, int cost, int yearManufactured, int distanceDriven) {
        this.brand = brand;
        this.cost = cost;
        this.yearManufactured = yearManufactured;
        this.distanceDriven = distanceDriven;
        this.dominanceIndex = 0;
    }

    public int getDominanceIndex() {
        return dominanceIndex;
    }

    public void setDominanceIndex(int index) {
        this.dominanceIndex = index;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public int getCost() {
        return cost;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }
}
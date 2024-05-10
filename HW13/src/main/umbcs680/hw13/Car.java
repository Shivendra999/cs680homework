package umbcs680.hw13;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    public static void main(String[] args) {
        List<Car> carList = List.of(
            new Car("Toyota", 20000, 2018, 50000),
            new Car("Honda", 25000, 2019, 40000),
            new Car("Ford", 18000, 2017, 60000)
        );

        // Ascending ordering
        Collections.sort(carList, (car1, car2) -> Integer.compare(car1.getDistanceDriven(), car2.getDistanceDriven()));
        System.out.println("Sorted by distance driven (ascending): " + carList);

        Collections.sort(carList, (car1, car2) -> Integer.compare(car1.getCost(), car2.getCost()));
        System.out.println("Sorted by price (ascending): " + carList);

        Collections.sort(carList, (car1, car2) -> Integer.compare(car1.getYearManufactured(), car2.getYearManufactured()));
        System.out.println("Sorted by year of manufacture (ascending): " + carList);

        Collections.sort(carList, Comparator.comparingInt(Car::getCost).thenComparingInt(Car::getDistanceDriven));
        System.out.println("Sorted by price and distance driven (ascending): " + carList);
    }
}

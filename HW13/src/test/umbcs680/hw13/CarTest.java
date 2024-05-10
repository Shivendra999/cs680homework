package umbcs680.hw13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Comparator;

public class CarTest {

    @Test
    public void testPriceDistanceComparatorWithDifferentCosts() {
        Car car1 = new Car("Ford", 25000, 2022, 40000);
        Car car2 = new Car("Chevrolet", 23000, 2023, 35000);

        int result = Comparator.comparingInt(Car::getCost)
                              .thenComparingInt(Car::getDistanceDriven)
                              .compare(car1, car2);

        assertTrue(result > 0, "Car1 should be more expensive and has driven less distance than Car2");
        System.out.println("PriceDistanceComparator result (different costs): " + result);
    }

    @Test
    public void testYearManufacturedComparator() {
        Car car1 = new Car("BMW", 30000, 2021, 25000);
        Car car2 = new Car("Mercedes", 28000, 2020, 28000);

        int result = Comparator.comparingInt(Car::getYearManufactured).compare(car1, car2);

        assertTrue(result > 0, "Car1 should be newer than Car2");
        System.out.println("YearManufacturedComparator result: " + result);
    }

    @Test
    public void testDistanceDrivenComparator() {
        Car car1 = new Car("Audi", 35000, 2019, 20000);
        Car car2 = new Car("Volkswagen", 32000, 2018, 22000);

        int result = Comparator.comparingInt(Car::getDistanceDriven).compare(car1, car2);

        assertTrue(result < 0, "Car1 should have driven less distance than Car2");
        System.out.println("DistanceDrivenComparator result: " + result);
    }

    @Test
    public void testYearManufacturedComparatorWithDifferentYears() {
        Car car1 = new Car("Tesla", 45000, 2020, 15000);
        Car car2 = new Car("Porsche", 42000, 2017, 18000);

        int result = Comparator.comparingInt(Car::getYearManufactured).compare(car1, car2);

        assertTrue(result > 0, "Car1 should be newer than Car2");
        System.out.println("YearManufacturedComparator result (different years): " + result);
    }
}

package umbcs680.hw11;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void testPriceDistanceComparatorWithDifferentCosts() {
        Car car1 = new Car("Ford", 25000, 2022, 40000);
        Car car2 = new Car("Chevrolet", 23000, 2023, 35000);

        PriceDistanceComparator<Car> priceDistanceComparator = new PriceDistanceComparator<>();
        int result = priceDistanceComparator.compare(car1, car2);

        if (result < 0) {
            System.out.println("Car1 is cheaper and has driven less distance than Car2.");
        } else if (result > 0) {
            System.out.println("Car1 is more expensive and has driven more distance than Car2.");
        } else {
            System.out.println("Costs and distances are equal. Comparing based on year of manufacture...");
            result = Integer.compare(car1.getYearManufactured(), car2.getYearManufactured());
        }

        assertTrue(result > 0, "Car1 should be more expensive and has driven less distance than Car2");
        System.out.println("PriceDistanceComparator result (different costs): " + result);
    }

    @Test
    public void testYearManufacturedComparator() {
        Car car1 = new Car("BMW", 30000, 2021, 25000);
        Car car2 = new Car("Mercedes", 28000, 2020, 28000);

        YearManufacturedComparator<Car> yearManufacturedComparator = new YearManufacturedComparator<>();
        int result = yearManufacturedComparator.compare(car1, car2);

        assertTrue(result > 0, "Car1 should be newer than Car2");
        System.out.println("YearManufacturedComparator result: " + result);
    }

    @Test
    public void testDistanceDrivenComparator() {
        Car car1 = new Car("Audi", 35000, 2019, 20000);
        Car car2 = new Car("Volkswagen", 32000, 2018, 22000);

        DistanceDrivenComparator<Car> distanceDrivenComparator = new DistanceDrivenComparator<>();
        int result = distanceDrivenComparator.compare(car1, car2);

        assertTrue(result < 0, "Car1 should have driven less distance than Car2");
        System.out.println("DistanceDrivenComparator result: " + result);
    }

    @Test
    public void testYearManufacturedComparatorWithDifferentYears() {
        Car car1 = new Car("Tesla", 45000, 2020, 15000);
        Car car2 = new Car("Porsche", 42000, 2017, 18000);

        YearManufacturedComparator<Car> yearManufacturedComparator = new YearManufacturedComparator<>();
        int result = yearManufacturedComparator.compare(car1, car2);

        assertTrue(result > 0, "Car1 should be newer than Car2");
        System.out.println("YearManufacturedComparator result (different years): " + result);
    }
}
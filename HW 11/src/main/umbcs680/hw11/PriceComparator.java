package umbcs680.hw11;
import java.util.Comparator;

public class PriceComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        int priceComparison = Integer.compare(car1.getCost(), car2.getCost());
        if (priceComparison == 0) {
            // If costs are equal, compare based on year of manufacture
            return Integer.compare(car1.getYearManufactured(), car2.getYearManufactured());
        }
        return priceComparison;
    }
}

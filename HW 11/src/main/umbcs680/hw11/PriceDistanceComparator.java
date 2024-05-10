package umbcs680.hw11;
import java.util.Comparator;

public class PriceDistanceComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        // Compare cars based on price and distance driven
        int priceComparison = Integer.compare(car1.getCost(), car2.getCost());
        int distanceComparison = Integer.compare(car1.getDistanceDriven(), car2.getDistanceDriven());

        // If prices are equal, compare based on distance driven
        if (priceComparison == 0) {
            return distanceComparison;
        }
        return priceComparison;
    }
}

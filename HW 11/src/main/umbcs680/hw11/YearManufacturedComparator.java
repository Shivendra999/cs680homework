package umbcs680.hw11;
import java.util.Comparator;

public class YearManufacturedComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        int yearComparison = Integer.compare(car1.getYearManufactured(), car2.getYearManufactured());
        if (yearComparison == 0) {
            return Integer.compare(car1.getCost(), car2.getCost());
        }
        return yearComparison;
    }
}
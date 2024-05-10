package umbcs680.hw11;
import java.util.Comparator;

public class DistanceDrivenComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        return Integer.compare(car1.getDistanceDriven(), car2.getDistanceDriven());
    }
}
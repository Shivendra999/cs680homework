package umbcs680.hw11;
import java.util.Comparator;

public class PriceDistanceComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        if (car1.getCost() < car2.getCost() && car1.getDistanceDriven() < car2.getDistanceDriven()) {
            return -1; 
        } else if (car2.getCost() < car1.getCost() && car2.getDistanceDriven() < car1.getDistanceDriven()) {
            return 1; 
        } else {
            return 0; 
        }
    }
}

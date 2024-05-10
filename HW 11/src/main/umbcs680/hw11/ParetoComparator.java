package umbcs680.hw11;
import java.util.Comparator;

public class ParetoComparator<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T car1, T car2) {
        // Check if car1 dominates car2 based on cost and mileage
        if (car1.getCost() < car2.getCost() && car1.getDistanceDriven() < car2.getDistanceDriven()) {
            return -1; // car1 dominates car2
        } else if (car2.getCost() < car1.getCost() && car2.getDistanceDriven() < car1.getDistanceDriven()) {
            return 1; // car2 dominates car1
        } else {
            return 0; // neither dominates the other
        }
    }
}

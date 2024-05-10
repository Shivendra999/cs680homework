package umbcs680.hw14;
// DateSorting.java
import java.util.Comparator;

public class DateSorting {
    public static Comparator<FSElement> dateComparator() {
        return Comparator.comparing(FSElement::getCreationTime);
    }
}
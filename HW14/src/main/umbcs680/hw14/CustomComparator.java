package umbcs680.hw14;
// CustomComparator.java
import java.util.Comparator;

public class CustomComparator {
    public static Comparator<FSElement> nameComparator() {
        return Comparator.comparing(FSElement::getName, String.CASE_INSENSITIVE_ORDER);
    }
}

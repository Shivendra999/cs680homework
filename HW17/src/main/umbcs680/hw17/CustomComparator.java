package umbcs680.hw17;
import java.util.Comparator;

public class CustomComparator {
    public static Comparator<FSElement> nameComparator() {
        return Comparator.comparing(CustomComparator::getName, String.CASE_INSENSITIVE_ORDER);
    }

    static String getName(FSElement f) {
        return f.getName();
    }
}

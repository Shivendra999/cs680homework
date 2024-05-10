package umbcs680.hw12;
// CustomComparator.java
import java.util.Comparator;

public class CustomComparator implements Comparator<FSElement> {
    @Override
    public int compare(FSElement a, FSElement b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}

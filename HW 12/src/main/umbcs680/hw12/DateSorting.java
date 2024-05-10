package umbcs680.hw12;
// DateSorting.java
import java.util.Comparator;

public class DateSorting implements Comparator<FSElement> {
    @Override
    public int compare(FSElement a, FSElement b) {
        return a.getCreationTime().compareTo(b.getCreationTime());
    }
}

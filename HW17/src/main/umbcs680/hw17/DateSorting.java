package umbcs680.hw17;
import java.util.Comparator;
import java.time.LocalDateTime;


public class DateSorting {
    public static Comparator<FSElement> dateComparator() {
        return Comparator.comparing(DateSorting::getCreationTime);
    }

    private static LocalDateTime getCreationTime(FSElement f) {
        return f.getCreationTime();
    }
}

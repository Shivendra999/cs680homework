package umbcs680.hw14;
// ExtensionSorting.java
import java.util.Comparator;

public class ExtensionSorting {
    public static Comparator<FSElement> extensionComparator() {
        return Comparator.comparing((FSElement f) -> {
            String filename = f.getName();
            int dotIndex = filename.lastIndexOf('.');
            return (dotIndex == -1) ? "" : filename.substring(dotIndex + 1);
        }, String.CASE_INSENSITIVE_ORDER)
        .thenComparing((FSElement f) -> {
            String filename = f.getName();
            int dotIndex = filename.lastIndexOf('.');
            return (dotIndex == -1) ? filename : filename.substring(0, dotIndex);
        }, String.CASE_INSENSITIVE_ORDER);
    }
}
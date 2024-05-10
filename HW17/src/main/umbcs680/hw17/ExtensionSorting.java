package umbcs680.hw17;
import java.util.Comparator;

public class ExtensionSorting {
    public static Comparator<FSElement> extensionComparator() {
        return Comparator.comparing(ExtensionSorting::getExtension)
                .thenComparing(ExtensionSorting::getBaseName, String.CASE_INSENSITIVE_ORDER);
    }

    static String getExtension(FSElement f) {
        String filename = f.getName();
        int dotIndex = filename.lastIndexOf('.');
        return (dotIndex == -1) ? "" : filename.substring(dotIndex + 1);
    }

    static String getBaseName(FSElement f) {
        String filename = f.getName();
        int dotIndex = filename.lastIndexOf('.');
        return (dotIndex == -1) ? filename : filename.substring(0, dotIndex);
    }
}

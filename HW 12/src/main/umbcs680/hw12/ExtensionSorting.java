package umbcs680.hw12;
// ExtensionSorting.java
import java.util.Comparator;

public class ExtensionSorting implements Comparator<FSElement> {
    @Override
    public int compare(FSElement a, FSElement b) {
        String nameA = a.getName();
        String nameB = b.getName();

        String extensionA = getExtension(nameA);
        String extensionB = getExtension(nameB);

        // Compare extensions
        int extensionComparison = extensionA.compareToIgnoreCase(extensionB);
        if (extensionComparison != 0) {
            return extensionComparison;
        }

        // If extensions are the same, compare base names
        String baseNameA = getBaseName(nameA);
        String baseNameB = getBaseName(nameB);
        return baseNameA.compareToIgnoreCase(baseNameB);
    }

    private String getExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        return (dotIndex == -1) ? "" : filename.substring(dotIndex + 1);
    }

    private String getBaseName(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        return (dotIndex == -1) ? filename : filename.substring(0, dotIndex);
    }
}

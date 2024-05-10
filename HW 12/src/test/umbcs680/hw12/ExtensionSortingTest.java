package umbcs680.hw12;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;

public class ExtensionSortingTest {

    @Test
    public void testExtensionSorting() {
        List<FSElement> elements = new ArrayList<>();
        elements.add(new FileStructure(null, "apple.txt", 10));
        elements.add(new FileStructure(null, "Banana.docx", 20));
        elements.add(new FileStructure(null, "cherry.pdf", 15));

        elements.sort(new ExtensionSorting());

        boolean sorted = true;
        for (int i = 1; i < elements.size(); i++) {
            FSElement prevElement = elements.get(i - 1);
            FSElement currentElement = elements.get(i);
            if (compare(prevElement, currentElement) > 0) {
                sorted = false;
                break;
            }
        }

        assertTrue(sorted, "The elements are not sorted correctly");
    }

    private int compare(FSElement a, FSElement b) {
        String nameA = a.getName();
        String nameB = b.getName();

        String extensionA = getExtension(nameA);
        String extensionB = getExtension(nameB);

        int extensionComparison = extensionA.compareToIgnoreCase(extensionB);
        if (extensionComparison != 0) {
            return extensionComparison;
        }

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

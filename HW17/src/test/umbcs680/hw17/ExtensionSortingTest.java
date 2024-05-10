package umbcs680.hw17;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExtensionSortingTest {

    @Test
    public void testExtensionSorting() {
        List<FSElement> elements = new ArrayList<>();
        elements.add(new FileStructure(null, "apple.txt", 10));
        elements.add(new FileStructure(null, "Banana.docx", 20));
        elements.add(new FileStructure(null, "cherry.pdf", 15));

        elements.sort(ExtensionSorting.extensionComparator());

        assertTrue(isSorted(elements, ExtensionSorting.extensionComparator()), "The elements are not sorted correctly");
    }

    private <T> boolean isSorted(List<T> elements, Comparator<T> comparator) {
        for (int i = 1; i < elements.size(); i++) {
            T prevElement = elements.get(i - 1);
            T currentElement = elements.get(i);
            if (comparator.compare(prevElement, currentElement) > 0) {
                return false;
            }
        }
        return true;
    }
}
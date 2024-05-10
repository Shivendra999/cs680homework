package umbcs680.hw12;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomComparatorTest {

    @Test
    public void testCustomComparator() {
        List<FSElement> elements = new ArrayList<>();
        elements.add(new FileStructure(null, "apple.txt", 10));
        elements.add(new FileStructure(null, "Banana.txt", 20));
        elements.add(new FileStructure(null, "cherry.txt", 15));

        // Shuffle the elements to ensure they are not already sorted
        Collections.shuffle(elements);

        // Sort the elements using the custom comparator
        elements.sort(new CustomComparator());

        // Check if elements are sorted in ascending order
        assertTrue(isSorted(elements), "The elements are not sorted correctly");
    }

    private boolean isSorted(List<FSElement> elements) {
        for (int i = 1; i < elements.size(); i++) {
            FSElement prevElement = elements.get(i - 1);
            FSElement currentElement = elements.get(i);
            if (prevElement.getName().compareToIgnoreCase(currentElement.getName()) > 0) {
                return false;
            }
        }
        return true;
    }
}

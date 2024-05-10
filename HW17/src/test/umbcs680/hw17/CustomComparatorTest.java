package umbcs680.hw17;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
        elements.sort(CustomComparator.nameComparator());

        // Check if elements are sorted in ascending order
        assertTrue(isSorted(elements, CustomComparator.nameComparator()), "The elements are not sorted correctly");
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

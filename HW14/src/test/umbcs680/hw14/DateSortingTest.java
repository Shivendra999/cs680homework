package umbcs680.hw14;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class DateSortingTest {

    @Test
    public void testDateSorting() {
        List<FSElement> elements = new ArrayList<>();
        elements.add(new FileStructure(null, "apple.txt", 10));
        elements.add(new FileStructure(null, "Banana.txt", 20));
        elements.add(new FileStructure(null, "cherry.txt", 15));

        elements.sort(DateSorting.dateComparator());

        assertEquals("apple.txt", elements.get(0).getName());
        assertEquals("Banana.txt", elements.get(1).getName());
        assertEquals("cherry.txt", elements.get(2).getName());
    }
}

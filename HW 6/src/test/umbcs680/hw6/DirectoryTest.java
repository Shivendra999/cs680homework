package umbcs680.hw6;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DirectoryTest {

    @Test
    public void testGetTotalSize() {
        Directory rootDir = new Directory(null, "root", 0);
        new File(rootDir, "testFile1", 20);
        new File(rootDir, "testFile2", 30);
        assertEquals(50, rootDir.getTotalSize(), "Expected Total size: 50");
    }
}

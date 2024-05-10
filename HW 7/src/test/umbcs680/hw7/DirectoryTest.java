package umbcs680.hw7;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DirectoryTest {

    @Test
    public void testGetTotalSize() {
        FileSystem fileSystem = FileSystem.getFileSystemInstance();
        Directory rootDir = new Directory(null, "root", 0);
        fileSystem.addRootDirectory(rootDir);
        new File(rootDir, "testFile1", 20);
        new File(rootDir, "testFile2", 30);
        assertEquals(50, rootDir.getTotalSize(), "Expected Total size: 50");
    }
}

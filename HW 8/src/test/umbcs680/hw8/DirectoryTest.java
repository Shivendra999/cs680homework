package umbcs680.hw8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DirectoryTest {

    @Test
    public void testGetTotalSizeWithVisitor() {
        // Create a file system
        FileSystem fileSystem = FileSystem.getFileSystemInstance();

        // Create root directory
        Directory rootDir = new Directory(null, "root", 0);
        fileSystem.addRootDirectory(rootDir);

        // Create subdirectories and files
        Directory subDir1 = new Directory(rootDir, "subDir1", 0);
        Directory subDir2 = new Directory(rootDir, "subDir2", 0);
        new File(subDir1, "testFile1", 20);
        new File(subDir1, "testFile2", 30);
        new File(subDir2, "testFile3", 10);

        // Create a visitor to calculate the total size
        SizeVisitor sizeVisitor = new SizeVisitor();

        // Accept the visitor on the root directory
        rootDir.accept(sizeVisitor);

        // Check if the calculated total size matches the expected total size
        assertEquals(60, sizeVisitor.getTotalSize(), "Expected Total size: 60");
    }
}

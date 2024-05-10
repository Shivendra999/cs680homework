package umbcs680.hw6;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FileSystemTest {
    @Test
public void testDirectorySize() {
    // Create a directory
    Directory myDirectory = new Directory(null, "myDir", 0);

    // Add files to the directory
    new File(myDirectory, "file1.txt", 20);
    new File(myDirectory, "file2.txt", 30);

    // Calculate the expected total size
    int expectedTotalSize = 20 + 30;

    // Verify that the total size matches the expected value
    assertEquals(expectedTotalSize, myDirectory.getTotalSize(), "Total size should match the sum of file sizes.");
}

    @Test
    public void testFile() {
        Directory rootDirectory = new Directory(null, "root", 0);
        File file = new File(rootDirectory, "anotherFile", 50); 
        assertEquals("anotherFile", file.getElementName()); 
        assertEquals(50, file.getElementSize()); 
        assertEquals(rootDirectory, file.getParentDirectory()); 
    }
    

    @Test
    public void testFileSystemSingleton() {
    FileSystem fileSystem1 = FileSystem.getFileSystemInstance();
    FileSystem fileSystem2 = FileSystem.getFileSystemInstance();

    assertSame(fileSystem1, fileSystem2); // Check if both instances are the same
}

}

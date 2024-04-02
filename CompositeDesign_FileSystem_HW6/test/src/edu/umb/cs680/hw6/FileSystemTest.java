package edu.umb.cs680.hw6;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

public class FileSystemTest {

    private static FileSystem fs;

    @BeforeAll
    public static void setUp() {
        fs = TestFixtureInitializer.createFS();
    }

    @Test
    public void verifyFileSystemNotNull() {
        assertNotNull(fs);
    }

    @Test
    public void verifyRootDirsNotEmpty() {
        assertFalse(fs.getRootDirs().isEmpty());
    }

    @Test
    public void verifyAppendRootDir() {
        int initialSize = fs.getRootDirs().size();
        Directory newDir = new Directory(null, "newRoot", 0, LocalDateTime.now());
        fs.appendRootDir(newDir);
        assertEquals(initialSize + 1, fs.getRootDirs().size());
        assertTrue(fs.getRootDirs().contains(newDir));
    }
    
    @AfterAll
    public static void cleanFileSystem() {
        fs.erase();
    }

}

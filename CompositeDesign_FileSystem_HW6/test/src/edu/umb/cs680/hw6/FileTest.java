package edu.umb.cs680.hw6;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class FileTest {
	private static FileSystem fs;
    private static Directory prjRoot;
    private static Directory src;
    private static File a;
    private static File b;

    @BeforeAll
    public static void setUp() {
        fs = TestFixtureInitializer.createFS();
        prjRoot = fs.getRootDirs().getFirst();
        src = (Directory) prjRoot.getChildren().get(0); // Assuming "src" is the first child of prjRoot
        a = (File) src.getChildren().get(0); // Assuming "A.java" is the first file within "src"
        b = (File) src.getChildren().get(1); // Assuming "B.java" is the second file within "src"
    }

    @Test
    public void verifyFileName() {
        assertEquals("A.java", a.getName());
        assertEquals("B.java", b.getName());
    }

    @Test
    public void verifyFileSize() {
        assertEquals(2048, a.getSize());
        assertEquals(3072, b.getSize());
    }

    @Test
    public void verifyIsDirectory() {
        assertFalse(a.isDirectory());
        assertFalse(b.isDirectory());
    }

    @Test
    public void verifyCreationTime() {
        LocalDateTime currentTime = LocalDateTime.of(2023, 11, 15, 10, 5, 0);
        assertEquals(currentTime, a.getCreationTime());
        assertEquals(currentTime, b.getCreationTime());
    }
    
    @AfterAll
    public static void cleanFileSystem() {
        fs.erase();
    }
}

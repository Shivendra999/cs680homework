package edu.umb.cs680.hw6;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class DirectoryTest {
    private static FileSystem fs;
    private static Directory root;
    private static Directory src;
    private static Directory test;


    @BeforeAll
    public static void setupFS() {
        fs = TestFixtureInitializer.createFS();
        root = fs.getRootDirs().getFirst();
        src = (Directory) root.getChildren().get(0);
        test = (Directory) root.getChildren().get(1);
    }

        private String[] dirToStringArray(Directory d) {
        String[] dirInfo = {
                d.getName(),
                String.valueOf(d.getSize()),
                d.getParent() == null ? "null" : d.getParent().getName(),
                d.getCreationTime().toString()
        };
        return dirInfo;
    }
        
        @Test
        public void testDirectoryEquality() {
            // Retrieving the root directory and one of its child directories
            Directory root = fs.getRootDirs().getFirst();
            Directory childDirectory = (Directory) root.getChildren().get(0);

            // Creating a duplicate of the child directory to test equality
            LocalDateTime currentTime = LocalDateTime.of(2023, 11, 15, 10, 5, 0);
            Directory duplicateChild = new Directory(root, "test", 0, currentTime);

            // Comparing specific properties of the directories using their string representations
            String[] originalProps = dirToStringArray(childDirectory);
            String[] duplicateProps = dirToStringArray(duplicateChild);

            assertArrayEquals(originalProps, duplicateProps);
        }

        
    @Test
    public void verifyDirectoryEqualityRoot() {
        String[] expected = {"repo", "0", "null", "2023-11-15T10:05"};
        assertArrayEquals(expected, dirToStringArray(root));
    }

    @Test
    public void verifyDirectoryEqualitySrc() {
        String[] expected = {"src", "0", "null", "2023-11-15T10:05"};
        assertArrayEquals(expected, dirToStringArray(src));
    }

    @Test
    public void verifyAppendChild() {
        Directory dir = new Directory(root, "newDir", 0, LocalDateTime.now());
        root.appendChild(dir);
        assertTrue(root.getChildren().contains(dir));
        assertEquals(root, dir.getParent());
    }


    @Test
    public void verifyRemoveChild() {
        Directory dir = (Directory) root.getChildren().get(0);
        root.removeChild(dir);
        assertFalse(root.getChildren().contains(dir));
        assertNull(dir.getParent());
    }


    @Test
    public void verifyGetTotalSize() {
        int expectedSize = 5120; // sizes of all files in src and test directories
        assertEquals(expectedSize, src.getTotalSize());
    }

    @Test
    public void verifyCountChildren() {
        int expectedCount = 2; // number of children in src directory
        assertEquals(expectedCount, src.countChildren());
    }
    
    @AfterAll
    public static void cleanFileSystem() {
        fs.erase();
    }


}


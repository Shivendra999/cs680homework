package edu.umb.cs680.hw6;

import java.time.LocalDateTime;

public class TestFixtureInitializer {
    public static FileSystem createFS() {
        LocalDateTime currentTime = LocalDateTime.of(2023, 11, 15, 10, 5, 0);

        FileSystem fileSystem = FileSystem.getFileSystem();
        Directory repo = new Directory(null, "repo", 0, currentTime);
        Directory src = new Directory(repo, "src", 0, currentTime);
        Directory test = new Directory(repo, "test", 0, currentTime);
        Directory srcUnderTest = new Directory(test, "src", 0, currentTime);
        File readme = new File(repo, "readme.md", 1024, currentTime);
        File fileA = new File(src, "A.java", 2048, currentTime);
        File fileB = new File(src, "B.java", 3072, currentTime);
        File fileATest = new File(srcUnderTest, "ATest.java", 4096, currentTime);
        File fileBTest = new File(srcUnderTest, "BTest.java", 5120, currentTime);

        repo.appendChild(src);
        repo.appendChild(test);
        repo.appendChild(readme);
        src.appendChild(fileA);
        src.appendChild(fileB);
        test.appendChild(fileATest);
        test.appendChild(fileBTest);

        fileSystem.appendRootDir(repo);

        return fileSystem;
    }
}


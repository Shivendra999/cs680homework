package umbcs680.hw8;
import java.util.ArrayList;



class FileSystem {
    private static FileSystem instance;
    private ArrayList<Directory> rootDirectories;

    private FileSystem() {
        rootDirectories = new ArrayList<>();
    }

    public static FileSystem getFileSystemInstance() {
        if (instance == null) {
            instance = new FileSystem();
        }
        return instance;
    }

    public ArrayList<Directory> getRootDirectories() {
        return rootDirectories;
    }

    public void addRootDirectory(Directory rootDirectory) {
        rootDirectories.add(rootDirectory);
    }
}
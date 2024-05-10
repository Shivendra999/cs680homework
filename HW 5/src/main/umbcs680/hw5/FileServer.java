package umbcs680.hw5;
import java.util.ArrayList;
import java.util.List;

// FileServer class representing a server that serves files to clients
class FileServer {
    private List<String> files;

    public FileServer() {
        this.files = new ArrayList<>();
        // Populate  sample files
        files.add("file1.txt");
        files.add("file2.txt");
        files.add("file3.txt");
    }

    public List<String> getFileList() {
        return files;
    }

    public byte[] getFile(String fileName) {
        return ("Contents of " + fileName).getBytes();
    }
}



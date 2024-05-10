package umbcs680.hw10;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void addChild(FileSystemElement child) {
        children.add(child);
    }

    @Override
    public String getName() {
        return name;
    }
}

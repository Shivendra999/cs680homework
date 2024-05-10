package umbcs680.hw14;
// FileStructure.java
import java.time.LocalDateTime;

class FileStructure extends FSElement {
    public FileStructure(DirectoryStructure parent, String name, int size) {
        super(name, size, LocalDateTime.now());
        if (parent != null) {
            parent.appendChild(this);
        }
    }
}

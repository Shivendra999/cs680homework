package umbcs680.hw6;
import java.time.LocalDateTime;

class File extends FSElement {
    public File(Directory parent, String name, int size) {
        super(name, size, LocalDateTime.now());
        if (parent != null) {
            parent.addChildFile(this);
        }
    }
}

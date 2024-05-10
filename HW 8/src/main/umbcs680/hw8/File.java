package umbcs680.hw8;
import java.time.LocalDateTime;

class File extends FSElement {
    public File(Directory parent, String name, int size) {
        super(name, size, LocalDateTime.now());
        if (parent != null) {
            parent.addChild(this);
        }
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
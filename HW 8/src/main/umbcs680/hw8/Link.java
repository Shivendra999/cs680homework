
package umbcs680.hw8;
import java.time.LocalDateTime;

class Link extends FSElement {
    private FSElement target;

    public Link(String name, FSElement target) {
        super(name, 0, LocalDateTime.now()); // Link doesn't have a size
        this.target = target;
    }

    public FSElement getTarget() {
        return target;
    }

    @Override
    public boolean isDirectory() {
        return target.isDirectory();
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
package umbcs680.hw12;
// DirectoryStructure.java
import java.time.LocalDateTime;
import java.util.LinkedList;

class DirectoryStructure extends FSElement {
    private LinkedList<FSElement> children;

    public DirectoryStructure(DirectoryStructure parent, String name, int size) {
        super(name, size, LocalDateTime.now());
        this.children = new LinkedList<>();
        if (parent != null) {
            parent.appendChild(this);
        }
    }

    public void appendChild(FSElement child) {
        children.add(child);
        child.setParent(this);
    }

    public LinkedList<FSElement> getChildren() {
        return children;
    }

    public int getTotalSize() {
        int totalSize = getSize();
        for (FSElement element : children) {
            if (element instanceof DirectoryStructure) {
                totalSize += ((DirectoryStructure) element).getTotalSize();
            } else {
                totalSize += element.getSize();
            }
        }
        return totalSize;
    }
}

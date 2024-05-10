package umbcs680.hw8;
import java.time.LocalDateTime;
import java.util.ArrayList;

class Directory extends FSElement {
    private ArrayList<FSElement> childElements;

    public Directory(Directory parent, String name, int size) {
        super(name, size, LocalDateTime.now());
        this.childElements = new ArrayList<>();
        if (parent != null) {
            parent.addChild(this);
        }
    }

    public void addChild(FSElement element) {
        childElements.add(element);
        element.setParentDirectory(this);
    }

    public ArrayList<FSElement> getChildElements() {
        return childElements;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FSElement element : childElements) {
            element.accept(visitor);
        }
    }

    // Implement getTotalSize() method using visitor pattern
    public int getTotalSize() {
        SizeVisitor sizeVisitor = new SizeVisitor();
        accept(sizeVisitor);
        return sizeVisitor.getTotalSize();
    }
}

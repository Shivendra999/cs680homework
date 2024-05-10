package umbcs680.hw8;
import java.time.LocalDateTime;

class FSElement {
    private String elementName;
    private int elementSize;
    private LocalDateTime creationDateTime;
    private Directory parentDirectory;

    public FSElement(String name, int size, LocalDateTime creationTime) {
        this.elementName = name;
        this.elementSize = size;
        this.creationDateTime = creationTime;
    }

    public String getElementName() {
        return elementName;
    }

    public int getElementSize() {
        return elementSize;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public Directory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(Directory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public boolean isDirectory() {
        return false; // Default implementation assuming FSElement represents a file
    }

    public void accept(FileSystemVisitor visitor) {
        // This method will be overridden by subclasses
    }
}

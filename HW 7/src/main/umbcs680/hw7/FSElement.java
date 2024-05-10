package umbcs680.hw7;
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

    // Getters and setters
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

    // Method to get the size of the element
    public int getSize() {
        return elementSize;
    }
}

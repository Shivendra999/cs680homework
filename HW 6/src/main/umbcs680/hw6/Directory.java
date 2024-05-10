package umbcs680.hw6;
import java.util.ArrayList;
import java.time.LocalDateTime;

class Directory {
    private String folderName;
    private int folderSize;
    private LocalDateTime folderCreationTime;
    private Directory parentFolder;
    private ArrayList<FSElement> childElements;

    public Directory(Directory parent, String name, int size) {
        this.folderName = name;
        this.folderSize = size;
        this.folderCreationTime = LocalDateTime.now();
        this.childElements = new ArrayList<>();
        if (parent != null) {
            parent.addChildDirectory(this);
        }
    }

    public void addChildDirectory(Directory childDirectory) {
        childElements.addAll(childDirectory.getChildElements());
        childDirectory.setParentFolder(this);
    }

    public void addChildFile(FSElement childFile) {
        childElements.add(childFile);
        childFile.setParentDirectory(this);
    }

    public ArrayList<FSElement> getChildElements() {
        return childElements;
    }

    public int getTotalSize() {
        int totalSize = folderSize;
        for (FSElement element : childElements) {
            totalSize += element.getElementSize(); 
        }
        return totalSize;
    }

    // Getters and setters
    public String getFolderName() { return folderName; }
    public int getFolderSize() { return folderSize; }
    public LocalDateTime getFolderCreationTime() { return folderCreationTime; }
    public Directory getParentFolder() { return parentFolder; }
    public void setParentFolder(Directory parentFolder) { this.parentFolder = parentFolder; }
}
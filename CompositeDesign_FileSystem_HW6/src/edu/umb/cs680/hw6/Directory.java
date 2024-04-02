package edu.umb.cs680.hw6;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

class Directory extends FSElement {
    private List<FSElement> children;

    public Directory(Directory parent, String name, int size, LocalDateTime creationTime) {
        super(parent, name, size, creationTime);
        this.children = new LinkedList<>();
    }

    public void appendChild(FSElement child) {
        children.add(child);
    }

    public void removeChild(FSElement child) {
        children.remove(child);
        if (child != null) {
            child.parent = null;
        }
    }


    // Getters
    @Override
    public boolean isDirectory() {
        return true;
    }

    public List<FSElement> getChildren() {
        return children;
    }

    public List<FSElement> getSubDirectories() {
        List<FSElement> subDirectories = new LinkedList<>();
        for (FSElement child : children) {
            if (child.isDirectory()) {
                subDirectories.add(child);
            }
        }
        return subDirectories;
    }

    public List<File> getFiles() {
        List<File> files = new LinkedList<>();
        for (FSElement child : children) {
            if (!child.isDirectory()) {
                files.add((File) child);
            }
        }
        return files;
    }

    public int countChildren() {
        return children.size();
    }

    public int getTotalSize() {
        int totalSize = this.size;
        for (FSElement child : children) {
            totalSize += child.isDirectory() ? ((Directory) child).getTotalSize() : child.getSize();
        }
        return totalSize;
    }
    
    public FSElement getFileByName(String name) {
        for (FSElement child : children) {
            if (child.getName().equals(name)) {
                return child;
            }
        }
        return null; // File not found
    }
}


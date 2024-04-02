package edu.umb.cs680.hw6;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

// Component
abstract class FSElement {
    protected Directory parent;
    protected String name;
    protected int size;
    protected LocalDateTime creationTime;

    public FSElement(Directory parent, String name, int size, LocalDateTime creationTime) {
        this.parent = parent;
        this.name = name;
        this.size = size;
        this.creationTime = creationTime;
    }

    // Getters
    public Directory getParent() {
        return parent;
    }

    public int getSize() {
        return size;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setSize(int size) {
        this.size = size;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean isDirectory();

}
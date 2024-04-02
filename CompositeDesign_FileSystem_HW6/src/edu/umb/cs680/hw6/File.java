package edu.umb.cs680.hw6;

import java.time.LocalDateTime;
import java.util.List;

class File extends FSElement {
    public File(Directory parent, String name, int size, LocalDateTime creationTime) {
        super(parent, name, size, creationTime);
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

}
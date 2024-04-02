package edu.umb.cs680.hw6;

import java.util.LinkedList;

class FileSystem {
    private static FileSystem instance;
    private LinkedList<Directory> rootDirs;

    private FileSystem() {
        this.rootDirs = new LinkedList<>();
    }

    public static FileSystem getFileSystem() {
        if (instance == null) {
            instance = new FileSystem();
        }
        return instance;
    }

    public LinkedList<Directory> getRootDirs() {
        return rootDirs;
    }

    public void appendRootDir(Directory root) {
        rootDirs.add(root);
    }
    
    public void erase() {
        this.rootDirs.clear();
    }
}

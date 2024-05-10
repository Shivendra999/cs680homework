package umbcs680.hw8;
class SizeVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(Directory dir) {
        // Directory size is not counted directly
        // Instead, it's the sum of the sizes of its children
    }

    @Override
    public void visit(File file) {
        // Add the size of the file to the total size
        totalSize += file.getElementSize();
    }

    @Override
    public void visit(Link link) {
        // Links don't contribute to size
    }

    

    public int getTotalSize() {
        return totalSize;
    }
}

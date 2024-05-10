package umbcs680.hw10;
public interface FileSystemVisitor {
    void visitFile(File file);
    void visitDirectory(Directory directory);
    void visitLink(Link link);
}

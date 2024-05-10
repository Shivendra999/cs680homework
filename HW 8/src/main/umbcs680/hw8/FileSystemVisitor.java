package umbcs680.hw8;
interface FileSystemVisitor {
    void visit(Directory dir);
    void visit(File file);
    void visit(Link link);
}
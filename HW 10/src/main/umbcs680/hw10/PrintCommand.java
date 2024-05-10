package umbcs680.hw10;
public class PrintCommand implements FileSystemCommand {
    private FileSystemElement element;

    public PrintCommand(FileSystemElement element) {
        this.element = element;
    }

    @Override
    public void execute() {
        System.out.println(element instanceof File ? "File: " + element.getName() :
                (element instanceof Directory ? "Directory: " + element.getName() :
                        "Link: " + element.getName()));
    }
}

package umbcs680.hw10;
public class SizeCommand implements FileSystemCommand {
    private File file;

    public SizeCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        System.out.println("Size of " + file.getName() + ": " + file.getSize() + " bytes");
    }
}

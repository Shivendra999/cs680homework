package umbcs680.hw10;
import java.util.ArrayList;
import java.util.List;

public class FileSystemInvoker {
    private List<FileSystemCommand> commandHistory;

    public FileSystemInvoker() {
        commandHistory = new ArrayList<>();
    }

    public void executeCommand(FileSystemCommand command) {
        command.execute();
        commandHistory.add(command);
    }
}

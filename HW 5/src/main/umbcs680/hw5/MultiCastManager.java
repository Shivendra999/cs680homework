package umbcs680.hw5;
import java.util.List;
import java.util.ArrayList;

class MulticastManager {
    private List<FileClient> clients;

    public MulticastManager() {
        this.clients = new ArrayList<>();
    }

    public void registerClient(FileClient client) {
        if (client != null) {
            clients.add(client);
        } else {
            // Handle null client 
            System.err.println("Warning: Trying to register a null client.");
        }
    }

    public void multicastFile(String fileName, byte[] fileContent) {
        if (fileName != null && fileContent != null) {
            for (FileClient client : clients) {
                client.receiveFile(fileName, fileContent);
            }
        } else {
            // Handle null file name or content 
            System.err.println("Error: Null file name or content.");
        }
    }
}

package umbcs680.hw16;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileServerTest {

    @Test
    public void testMulticastManagerMulticastFile() {
        // Create a multicast manager
        MulticastManager multicastManager = new MulticastManager();

        // Register clients with the multicast manager
        FileClient client1 = new FileClient("client1Identifier");
        FileClient client2 = new FileClient("client2Identifier");
        multicastManager.registerClient(client1);
        multicastManager.registerClient(client2);

        // Multicast a file
        byte[] fileContent = "File content".getBytes();
        String fileName = "example.txt";
        multicastManager.multicastFile(fileName, fileContent);

        // Assert that clients received the file
        assertArrayEquals(fileContent, client1.getLastReceivedFileContent());
        assertEquals(fileName, client1.getLastReceivedFileName());
        assertArrayEquals(fileContent, client2.getLastReceivedFileContent());
        assertEquals(fileName, client2.getLastReceivedFileName());
    }
}

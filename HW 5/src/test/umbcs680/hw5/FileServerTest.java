package umbcs680.hw5;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class FileServerTest {

    @Test
    public void testFileServerGetFileList() {
        FileServer server = new FileServer();
        List<String> expectedFiles = Arrays.asList("file1.txt", "file2.txt", "file3.txt");

        // Check if the file list contains the expected files
        assertEquals(expectedFiles.size(), server.getFileList().size());
        // Verify specific file names
        for (String expectedFile : expectedFiles) {
            assertTrue(server.getFileList().contains(expectedFile));
        }
    }

    @Test
    public void testFileClientReceiveFile() {
        // Create a file client
        FileClient client = new FileClient("Client1");

        // Capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Receive a file
        byte[] fileContent = "File content".getBytes();
        client.receiveFile("example.txt", fileContent);

        // Assert output
        assertEquals("[Client1] Received file: example.txt\nFile content: File content\n", outputStream.toString());
    }

    @Test
public void testMulticastManagerMulticastFile() {
    // Create a multicast manager
    MulticastManager multicastManager = new MulticastManager();

    // Create actual file clients with the required String argument
    FileClient client1 = new FileClient("client1Identifier");
    FileClient client2 = new FileClient("client2Identifier");

    // Register clients with the multicast manager
    multicastManager.registerClient(client1);
    multicastManager.registerClient(client2);

    // Multicast a file
    byte[] fileContent = "File content".getBytes();
    String fileName = "example.txt";
    multicastManager.multicastFile(fileName, fileContent);

    // Assert that the file content was received by the clients
    assertArrayEquals(fileContent, client1.getLastReceivedFileContent());
    assertArrayEquals(fileContent, client2.getLastReceivedFileContent());
    assertEquals(fileName, client1.getLastReceivedFileName());
    assertEquals(fileName, client2.getLastReceivedFileName());
}


}

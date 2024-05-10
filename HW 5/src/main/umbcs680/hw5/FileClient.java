package umbcs680.hw5;
class FileClient {
    private String name;
    private String lastReceivedFileName;
    private byte[] lastReceivedFileContent;

    public FileClient(String name) {
        this.name = name;
    }

    public void receiveFile(String fileName, byte[] fileContent) {
        System.out.println("[" + name + "] Received file: " + fileName);
        System.out.println("File content: " + new String(fileContent));

        // Save the received file information for testing purposes
        this.lastReceivedFileName = fileName;
        this.lastReceivedFileContent = fileContent.clone(); // Clone to prevent external modification
    }

    // Method to retrieve the last received file content for testing
    public byte[] getLastReceivedFileContent() {
        return lastReceivedFileContent;
    }

    // Method to retrieve the last received file name for testing
    public String getLastReceivedFileName() {
        return lastReceivedFileName;
    }
}

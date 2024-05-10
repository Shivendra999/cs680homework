# File Server Application

This application simulates a file Server system where a server can send files to multiple clients simultaneously.

## How it Works:

1. **FileServer**: This class represents a server that contains a list of available files. Clients can request files from this server.

2. **FileClient**: Each client can receive files from the server. When a file is received, it prints out the file name and content.

3. **MulticastManager**: This class manages the Server functionality. It maintains a list of registered clients and can multicast a file to all registered clients.

### Implementation of Multicast Design Pattern:
- **Registration**: Clients can register themselves with the MulticastManager using the `registerClient` method.

- **Multicasting**: The `multicastFile` method in MulticastManager sends a file to all registered clients. 

   It iterates through the list of registered clients and calls the `receiveFile` method on each client, providing the file name and content.

- **Decoupling**: This design decouples the sender (MulticastManager) from the receivers (FileClients).

  The sender doesn't need to know how many clients   are   there or their identities; It simply sends the   file to all registered clients, and the clients handle the file reception accordingly.
  
# Unit Tests
  - **FileServerTest:** Tests the functionality of the FileServer class, including getting the file list and receiving files by clients.
  - **FileClientTest:** Tests the functionality of the FileClient class, specifically the reception of files.
  - **MulticastManagerTest:** Tests the functionality of the MulticastManager class, including client registration and file Server.


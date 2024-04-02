DocuSignSystem Simulation
 
Introduction:
 
DocuSign is a popular electronic signature solution that simplifies the document signing process. It allows users to create, send, and sign documents securely. This program, "DocuSign System," provides a simplified simulation of the document signing workflow inspired by DocuSign.

In this simulation, you can select the state of a document (Draft, Sent, Signed, or Cancelled) and observe how the document's behavior changes based on its current state. This program showcases the state design pattern, illustrating how the document's state-dependent behavior and logical state transfer are managed.
 
Program Overview:
 
Classes
 
	•	DocumentContext: This class represents the context of the document. It holds the current state of the document and manages state transitions. The canEdit and canSend attributes control whether the document can be edited or sent based on its state.
	•	DocumentState (Interfaces):
	•	DraftState: Implements the behavior of a document in the draft state. Documents in the draft state can be edited and sent.
	•	SentState: Represents the sent state, where editing and sending are not allowed.
	•	SignedState: Represents the signed state, with restrictions on editing and sending.
	•	CancelledState: Represents the cancelled state, where editing is allowed, but sending is not.
 
Simulation:
The program allows you to select the state of the document and demonstrates how the document's behavior changes accordingly. You can interact with the program by selecting a state for the document. The program will provide feedback on the document's capabilities (edit and send) in the current state.
 
How to Run:
 
1. Download this GitHub repo into your local and when inside the program directory
'StateDesign_DocuSignSystem_HW4', please locate the ANT build.xml renamed as
statechange.xml. Run command ant -f statechange.xml in your shell.
2. This command will Compile the Java files and place the class files in the bin folder
and it would do a similar action for the test java files and place the test class under
test/bin folder.
3. The ant command will also run the DocuSignSystem class, which includes the main
method.
4. Review the simulation of moving between states of an e-signature application cycle, for example like Draft, Send, Cancel etc.
5. Note: Main method is driving this program without any pre-input values, hence user is expected to feed in the input via keyboard.
 
Examples:
	•	Selecting "Draft" will allow you to edit and send the document.
	•	Selecting "Sent" or "Signed" will restrict editing and sending.
	•	Selecting "Cancelled" will allow editing but not sending.
 
State Design Pattern:
The state design pattern used in this program allows the document to exhibit different behaviors and transition logically between states. Each state class defines the specific behavior of the document in that state, providing a clear separation of concerns. The DocumentContext manages the current state and enforces state-dependent restrictions on editing and sending.
This program serves as a simplified demonstration of the state design pattern and how it can be used to model real-world workflows, such as document signing.

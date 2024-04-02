This README describes the program's functionality, its use of the Observer Design Pattern, and how a system can be extended to include various home automation features while maintaining a clean separation of concerns through the Observer pattern.   Home Automation System with Observer Design Pattern This Java program simulates a Home Automation System using the Observer Design Pattern. The system includes features for home security, fire alarms, and lighting control. Multiple user devices, such as mobile phones, tablets, alarm panels, and light switches, act as observers and are notified when events occur. Features:
	•	Security System: The Security System can be armed and disarmed. When armed, it can trigger an alarm in response to an intrusion.
	•	Fire Alarm: The system includes a fire alarm feature. The fire alarm can be activated and deactivated to handle fire-related events.
	•	Lighting Control: Lighting control allows users to turn lights on and off in various rooms.
	•	User Devices: User devices, including mobile phones, tablets, alarm panels, and light switches, are observers. They register with the appropriate systems and receive notifications when security events, 		fire alarms, or lighting control events occur.

	•	Observer Design Pattern 		The program demonstrates the Observer Design Pattern, which establishes a one-to-many dependency between objects. In this context:
	•	Subject (Observable): The SecuritySystem and LightingControl classes are subjects (Observables) that represent the respective systems. They maintain their states and notify their observers when events 		occur.
	•	Observers: User devices, represented by the UserDevice class, are observers. They register with the systems they want to observe and are automatically notified when events related to security, fire 			alarms, or lighting control occur. 
	•	How it Works
	•	Setting up Observers: User devices, including mobile phones, tablets, alarm panels, and light switches, are created and added as observers to the relevant systems (security or lighting control).
	•	Arming and Disarming: The security system can be armed and disarmed. When armed, it can trigger an alarm upon detecting an intrusion. Observers are notified when the system is armed or disarmed.
	•	Fire Alarm: The system includes a fire alarm feature that can be activated and deactivated. Observers are notified when the fire alarm is activated or deactivated.
	•	Lighting Control: Lighting control allows users to turn lights on and off in various rooms. Observers are notified when lights are turned on or off.
	•	Observer Notifications: When security or fire alarm events occur, or when lighting is controlled, the observers (user devices) receive notifications and display event information. 
	•	How to Run
	1.	Download this GitHub repo into your local and when inside the program directory 'ObserverDesign_HomeAutomationSystem_HW5', please locate the ANT build.xml renamed as observer.xml. 		Run command ant -f observer.xml in your shell.
	2.	This command will Compile the Java files and place the class files in the bin folder and it would do a similar action for the test java files and place the test class under test/bin folder.
	3.	The ant command will also run the HomeAutomationSystem class, which includes the main method.
	4.	Review and observe how user devices respond to changes in the security system's state, fire alarm status, and lighting control.

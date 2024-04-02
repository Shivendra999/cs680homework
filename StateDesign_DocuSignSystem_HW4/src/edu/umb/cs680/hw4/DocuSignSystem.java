package edu.umb.cs680.hw4;

import java.util.Scanner;

public class DocuSignSystem {
    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a state: (1) Draft, (2) Send, (3) Signed, (4) Cancelled, (5) Exit");
            int choice;

            try {
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 to 5.");
                scanner.nextLine();  // Clear the input buffer
                continue;
            }

            if (choice == 1) {
                context.setState(new DraftState());
            } else if (choice == 2) {
                context.setState(new SentState());
            } else if (choice == 3) {
                context.setState(new SignedState());
            } else if (choice == 4) {
                context.setState(new CancelledState());
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option between 1 to 5.");
            }

            context.performAction();

            // Check if editing is allowed
            if (context.canEdit()) {
                System.out.println("You can edit the document.");
            } else {
                System.out.println("Editing is not allowed in the current state.");
            }

            // Check if sending is allowed
            if (context.canSend()) {
                System.out.println("You can send the document.");
            } else {
                System.out.println("Sending is not allowed in the current state.");
            }
        }

        System.out.println("Exiting the DocuSign program.");
    }
}
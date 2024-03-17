package edu.umb.cs680.hw4;

class CancelledState implements DocumentState {
    @Override
    public void handleState(DocumentContext context) {
        System.out.println("Document is cancelled.");
        context.setCanEdit(true);
        context.setCanSend(false);
    }
}
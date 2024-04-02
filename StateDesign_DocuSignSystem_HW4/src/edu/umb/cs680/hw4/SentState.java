package edu.umb.cs680.hw4;

class SentState implements DocumentState {
    @Override
    public void handleState(DocumentContext context) {
        System.out.println("Document is sent for signature.");
        context.setCanEdit(false);
        context.setCanSend(false);
    }
}      
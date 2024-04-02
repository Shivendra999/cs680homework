package edu.umb.cs680.hw4;

class DraftState implements DocumentState {
    @Override
    public void handleState(DocumentContext context) {
        System.out.println("Document is in draft state.");
        context.setCanEdit(true);
        context.setCanSend(true);
    }
}
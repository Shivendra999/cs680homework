package edu.umb.cs680.hw4;

class SignedState implements DocumentState {
    @Override
    public void handleState(DocumentContext context) {
        System.out.println("Document is signed.");
        context.setCanEdit(false);
        context.setCanSend(false);
    }
}
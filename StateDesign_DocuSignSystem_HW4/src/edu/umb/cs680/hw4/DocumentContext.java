package edu.umb.cs680.hw4;

class DocumentContext {
    private DocumentState currentState;
    private boolean canEdit;
    private boolean canSend;

    public DocumentContext() {
        this.canEdit = true; // By default, the document is editable.
        this.canSend = true; // By default, the document can be sent.
    }

    public void setState(DocumentState state) {
        currentState = state;
    }

    public void performAction() {
        currentState.handleState(this);
    }

    public boolean canEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean canSend() {
        return canSend;
    }

    public void setCanSend(boolean canSend) {
        this.canSend = canSend;
    }
}

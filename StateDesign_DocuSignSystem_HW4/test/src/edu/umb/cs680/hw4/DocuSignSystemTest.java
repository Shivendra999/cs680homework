package edu.umb.cs680.hw4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


	public class DocuSignSystemTest {
	    private DocumentContext context;

	    @BeforeEach
	    void setUp() {
	        context = new DocumentContext();
	    }

	    @Test
	    public void testEditInDraftState() {
	        context.setState(new DraftState());
	        context.performAction();
	        assertTrue(context.canEdit());
	    }

	    @Test
	    public void testEditInCancelledState() {
	        context.setState(new CancelledState());
	        context.performAction();
	        assertTrue(context.canEdit());
	    }

	    @Test
	    public void testEditInSentState() {
	        context.setState(new SentState());
	        context.performAction();
	        assertFalse(context.canEdit());
	    }

	    @Test
	    public void testEditInSignedState() {
	        context.setState(new SignedState());
	        context.performAction();
	        assertFalse(context.canEdit());
	    }

	    @Test
	    public void testSendInDraftState() {
	        context.setState(new DraftState());
	        context.performAction();
	        assertTrue(context.canSend());
	    }

	    @Test
	    public void testSendInCancelledState() {
	        context.setState(new CancelledState());
	        context.performAction();
	        assertFalse(context.canSend());
	    }

	    @Test
	    public void testSendInSentState() {
	        context.setState(new SentState());
	        context.performAction();
	        assertFalse(context.canSend());
	    }

	    @Test
	    public void testSendInSignedState() {
	        context.setState(new SignedState());
	        context.performAction();
	        assertFalse(context.canSend());
	    }
	    
	    @Test
	    public void testEditInInvalidState() {
	        context.setState(new SentState());
	        context.setCanEdit(false);  // Editing is not allowed in Sent state
	        context.performAction();
	        
	        assertFalse(context.canEdit());  // Editing is not allowed
	        assertFalse(context.canSend());  // Sending is also not allowed
	    }


	}




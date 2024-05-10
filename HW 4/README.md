# Parking Meter Application

This application simulates a parking meter system where users can insert coins, select parking durations, and receive parking tickets based on their selections.

## State Design Pattern Implementation:

The State design pattern is used to model the different states that the parking meter can be in and manage transitions between these states based on user actions.

###  1. ParkingMeterState Interface:
   - Defines the behaviors of different states a parking meter can be in, including inserting coins, selecting parking durations, and dispensing tickets.

### 2. Concrete State Classes:
   - AcceptingPaymentState: Represents the state when the parking meter is accepting payment.
   - DispensingTicketState: Represents the state when the parking meter is dispensing a parking ticket.
   - IdleState: Represents the idle state when the parking meter is waiting for payment.
   - SelectingDurationState: Represents the state when the user is selecting a parking duration.

### 3. ParkingMeterContext Class:
   - Manages the current state of the parking meter and delegates actions to the appropriate state object.
   - Follows the singleton pattern to ensure there's only one instance of the parking meter context.

## How the State Pattern Works:

- Initially, the parking meter is in the IdleState, waiting for the user to insert coins.
- Upon inserting coins, the state transitions to AcceptingPaymentState, where the user can continue to insert coins.
- After inserting coins, the user can select a parking duration, transitioning the state to SelectingDurationState.
- Once a duration is selected, the state changes to DispensingTicketState, and a parking ticket is dispensed.
- After dispensing the ticket, the state returns to IdleState, ready for the next user interaction.

## Unit Tests:

- Test cases are provided to ensure the correctness of the parking meter functionalities, including coin insertion, duration selection, and ticket dispensing.
- Assertions are used to verify expected behaviors and state transitions.
- Exceptions , such as attempting to dispense a ticket without selecting a duration, are also covered to handle exceptions appropriately.

package umbcs680.hw4;
public class SelectingDurationState implements ParkingMeterState {

    @Override
    public void insertCoin(double amount) {
        throw new IllegalStateException("Payment already received");
    }

    @Override
    public void selectDuration(int duration) {
        throw new IllegalStateException("Duration already selected");
    }

    @Override
    public void dispenseTicket() {
        if (ParkingMeterContext.getInstance().getSelectedDuration() == 0) {
            throw new IllegalStateException("No duration selected to dispense ticket");
        }
        ParkingMeterContext.getInstance().setState(new DispensingTicketState());
    }
}

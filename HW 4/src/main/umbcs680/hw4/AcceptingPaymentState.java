package umbcs680.hw4;
public class AcceptingPaymentState implements ParkingMeterState {

    @Override
    public void insertCoin(double amount) {
        ParkingMeterContext.getInstance().addToPayment(amount);
    }

    @Override
    public void selectDuration(int duration) {
        ParkingMeterContext.getInstance().setSelectedDuration(duration);
        ParkingMeterContext.getInstance().setState(new SelectingDurationState());
    }

    @Override
    public void dispenseTicket() {
        throw new IllegalStateException("Cannot dispense ticket without selecting duration");
    }
}
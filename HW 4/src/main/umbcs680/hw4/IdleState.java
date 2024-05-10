package umbcs680.hw4;
public class IdleState implements ParkingMeterState {

    @Override
    public void insertCoin(double amount) {
        ParkingMeterContext.getInstance().addToPayment(amount);
        ParkingMeterContext.getInstance().setState(new AcceptingPaymentState());
    }

    @Override
    public void selectDuration(int duration) {
        throw new IllegalStateException("Cannot select duration without inserting payment");
    }

    @Override
    public void dispenseTicket() {
        throw new IllegalStateException("No ticket to dispense");
    }
}

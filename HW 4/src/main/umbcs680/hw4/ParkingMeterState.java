package umbcs680.hw4;
public interface ParkingMeterState {
    void insertCoin(double amount);
    void selectDuration(int duration);
    void dispenseTicket();
}
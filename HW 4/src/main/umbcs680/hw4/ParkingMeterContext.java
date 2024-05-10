package umbcs680.hw4;
public class ParkingMeterContext {
    private static ParkingMeterContext instance;
    private ParkingMeterState currentState;
    private double payment;
    private int selectedDuration;
    
    private ParkingMeterContext() {
        // Private constructor to enforce singleton pattern
        this.currentState = new IdleState();
        this.payment = 0.0;
        this.selectedDuration = 0;
    }

    public static ParkingMeterContext getInstance() {
        if (instance == null) {
            instance = new ParkingMeterContext();
        }
        return instance;
    }

    public void setState(ParkingMeterState state) {
        this.currentState = state;
    }

    public void insertCoin(double amount) {
        currentState.insertCoin(amount);
    }

    public void selectDuration(int duration) {
        if (selectedDuration != 0) {
            throw new IllegalStateException("Duration already selected");
        }
        currentState.selectDuration(duration);
    }

    public void dispenseTicket() {
        currentState.dispenseTicket();
    }

    public double getPayment() {
        return payment;
    }

    public void addToPayment(double amount) {
        this.payment += amount; 
    }
        
    public int getSelectedDuration() {
        return selectedDuration;
    }

    public void setSelectedDuration(int selectedDuration) {
        this.selectedDuration = selectedDuration;
    }
}

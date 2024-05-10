package umbcs680.hw4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingMeterTest {

    private ParkingMeterContext parkingMeter;

    @BeforeEach
    public void setUp() {
        parkingMeter = ParkingMeterContext.getInstance();
    }

    @Test
    public void testInsertCoin() {
        parkingMeter.insertCoin(3.0); // Inserting $3.00
        parkingMeter.insertCoin(1.5); // Inserting $1.50
        assertEquals(4.5, parkingMeter.getPayment()); // Total payment should be $4.50
    }

    @Test
    public void testDispenseTicketWithoutDurationSelection() {
        assertThrows(IllegalStateException.class, () -> {
            parkingMeter.dispenseTicket();
        });
    }

    @Test
    public void testSelectDuration() {
        parkingMeter.selectDuration(6); // Selecting a duration of 6 hours
        assertEquals(6, parkingMeter.getSelectedDuration(), "Selected duration should be 6 hours");
    }
}

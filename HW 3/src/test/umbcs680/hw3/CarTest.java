package umbcs680.hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private String[] carInfoToArray(Car car) {
        return new String[]{car.getBrand(), car.getModel(), String.valueOf(car.getYear())};
    }

    @Test
    public void verifyCarEqualityWithBrandModelYear() {
        String[] expected = {"Nissan", "Altima", "2018"};
        Car actual = new Car("Nissan", "Altima", 2018, 0, 0.0f);
        assertArrayEquals(expected, carInfoToArray(actual));
    }

    @Test
    public void verifyCarInequalityWithDifferentBrand() {
        String[] expected = {"Toyota", "RAV4", "2018"};
        Car actual = new Car("Honda", "RAV4", 2018, 0, 0.0f);
        assertNotEquals(expected, carInfoToArray(actual));
    }

    @Test
    public void verifyCarInequalityWithDifferentModel() {
        String[] expected = {"Toyota", "Camry", "2018"};
        Car actual = new Car("Toyota", "Camry", 2018, 0, 0.0f);
        assertNotEquals(expected, carInfoToArray(actual));
    }

    @Test
    public void verifyCarInequalityWithDifferentYear() {
        String[] expected = {"Toyota", "RAV4", "2019"};
        Car actual = new Car("Toyota", "RAV4", 2019, 0, 0.0f);
        assertNotEquals(expected, carInfoToArray(actual));
    }
}

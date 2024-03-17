package edu.umb.cs680.hw3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTest {
	
	private String[] carToStringArray(Car car) {
        return new String[]{car.getMake(), car.getModel(), String.valueOf(car.getYear())};
    }
	

    @Test
    public void testCarConstructorWithValidInput() {
        Car car = new Car("Kia", "Seltos", 50000, 2020, 25000.0f);
        assertNotNull(car);
    }

    @Test
    public void testCarGetMake() {
        Car car = new Car("Honda", "Civic", 30000, 2019, 22000.0f);
        assertEquals("Honda", car.getMake());
    }

    @Test
    public void testCarGetYear() {
        Car car = new Car("Jeep", "Compass", 40000, 2022, 18000.0f);
        assertEquals(2022, car.getYear());
    }

    @Test
    public void testCarConstructorWithNegativeMileage() {
        assertThrows(IllegalArgumentException.class, () -> new Car("Hyundai", "Venue", -60000, 2018, 15000.0f));
    }

    @Test
    public void testCarConstructorWithInvalidPrice() {
        assertThrows(IllegalArgumentException.class, () -> new Car("BMW", "520d", 80000, 2017, -12000.0f));
    }
    
    @Test
    public void testVerifyCarEqualityWithMakeModelYear() {
        Car car1 = new Car("Cadillac", "Escalade", 50000, 2020, 25000.0f);
        Car car2 = new Car("Cadillac", "Escalade", 50000, 2020, 25000.0f);

        String[] car1Properties = carToStringArray(car1);
        String[] car2Properties = carToStringArray(car2);

        assertArrayEquals(car1Properties, car2Properties);
    }
    
    @Test
    public void testVerifyCarEqualityWithSpecificProperties() {
        String[] expected = {"Hyundai", "Creta", "2018"};
        Car actual = new Car("Hyundai", "Creta", 80000, 2018, 18000.0f);

        assertArrayEquals(expected, carToStringArray(actual));
    }
}

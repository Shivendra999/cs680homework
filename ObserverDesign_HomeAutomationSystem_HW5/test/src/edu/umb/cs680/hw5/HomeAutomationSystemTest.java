package edu.umb.cs680.hw5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeAutomationSystemTest {
    private SecuritySystem securitySystem;
    private LightingControl lightingControl;
    private UserDevice phone;

    @BeforeEach
    public void setup() {
        securitySystem = new SecuritySystem();
        lightingControl = new LightingControl();
        phone = new UserDevice("Cellular Phone");
    }

    @Test
    public void testArmSecuritySystem() {
        securitySystem.addObserver(phone);
        securitySystem.arm();
        assertEquals("Cellular Phone: Security System is armed.", phone.getLastNotification());
    }

    @Test
    public void testDisarmSecuritySystem() {
        securitySystem.addObserver(phone);
        securitySystem.disarm();
        assertEquals("Cellular Phone: Security System is already disarmed.", phone.getLastNotification());
    }

    @Test
    public void testTurnOnLights() {
        lightingControl.addObserver(phone);
        lightingControl.turnOnLights();
        assertEquals("Cellular Phone: Lights are on.", phone.getLastNotification());
    }

    @Test
    public void testTurnOffLights() {
        lightingControl.addObserver(phone);
        lightingControl.turnOffLights();
        assertEquals("Cellular Phone: Lights are already off.", phone.getLastNotification());
    }

    @Test
    public void testTriggerAlarm() {
        securitySystem.addObserver(phone);
        securitySystem.arm();
        securitySystem.triggerAlarm();
        assertEquals("Cellular Phone: Intruder alert! Alarm triggered.", phone.getLastNotification());
    }

    @Test
    public void testActivateFireAlarm() {
        securitySystem.addObserver(phone);
        securitySystem.arm();
        securitySystem.activateFireAlarm();
        assertEquals("Cellular Phone: Fire alarm activated!", phone.getLastNotification());
    }

    @Test
    public void testDeactivateFireAlarm() {
        securitySystem.addObserver(phone);
        securitySystem.arm();
        securitySystem.activateFireAlarm();
        securitySystem.deactivateFireAlarm();
        assertEquals("Cellular Phone: Fire alarm deactivated.", phone.getLastNotification());
    }

    @Test
    public void testArmAlreadyArmedSecuritySystem() {
        securitySystem.addObserver(phone);
        securitySystem.arm();
        securitySystem.arm(); // Attempting to arm the already armed system
        assertEquals("Cellular Phone: Security System is already armed.", phone.getLastNotification());
    }

    @Test
    public void testDisarmAlreadyDisarmedSecuritySystem() {
        securitySystem.addObserver(phone);
        securitySystem.disarm();
        securitySystem.disarm(); // Attempting to disarm the already disarmed system
        assertEquals("Cellular Phone: Security System is already disarmed.", phone.getLastNotification());
    }

    @Test
    public void testTurnOnAlreadyOnLights() {
        lightingControl.addObserver(phone);
        lightingControl.turnOnLights();
        lightingControl.turnOnLights(); // Attempting to turn on already on lights
        assertEquals("Cellular Phone: Lights are already on.", phone.getLastNotification());
    }

    @Test
    public void testTurnOffAlreadyOffLights() {
        lightingControl.addObserver(phone);
        lightingControl.turnOffLights();
        lightingControl.turnOffLights(); // Attempting to turn off already off lights
        assertEquals("Cellular Phone: Lights are already off.", phone.getLastNotification());
    }

    @Test
    public void testTriggerAlarmWhenDisarmed() {
        securitySystem.addObserver(phone);
        securitySystem.triggerAlarm(); // Attempting to trigger alarm when disarmed
        assertEquals("Cellular Phone: Cannot trigger alarm - Security System is disarmed.", phone.getLastNotification());
    }

    @Test
    public void testActivateFireAlarmWhenDisarmed() {
        securitySystem.addObserver(phone);
        securitySystem.activateFireAlarm(); // Attempting to activate fire alarm when disarmed
        assertEquals("Cellular Phone: Cannot activate fire alarm - Security System is disarmed.", phone.getLastNotification());
    }
}

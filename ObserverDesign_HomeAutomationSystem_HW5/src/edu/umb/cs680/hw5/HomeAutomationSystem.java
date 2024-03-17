package edu.umb.cs680.hw5;


public class HomeAutomationSystem {
    public static void main(String[] args) {
        // Create a security system
        SecuritySystem securitySystem = new SecuritySystem();

        // Create a lighting control system
        LightingControl lightingControl = new LightingControl();

        // Create and add user devices as observers for security system
        UserDevice phone = new UserDevice("Cellular Phone");
        UserDevice tablet = new UserDevice("iPad");
        UserDevice alarmPanel = new UserDevice("Alarm Panel");

        securitySystem.addObserver(phone);
        securitySystem.addObserver(tablet);
        securitySystem.addObserver(alarmPanel);

        // Create and add user devices as observers for lighting control
        UserDevice livingRoomLight = new UserDevice("Living Room Light Switch");
        UserDevice kitchenLight = new UserDevice("Kitchen Light Switch");

        lightingControl.addObserver(livingRoomLight);
        lightingControl.addObserver(kitchenLight);

        // Arm the security system
        securitySystem.arm();

        // Try to arm the system again (error handling)
        securitySystem.arm();

        // Turn on the lights
        lightingControl.turnOnLights();

        // Try to turn on the lights again (error handling)
        lightingControl.turnOnLights();

        // Trigger an alarm (simulated intrusion)
        securitySystem.triggerAlarm();

        // Disarm the security system
        securitySystem.disarm();

        // Deactivate the fire alarm (error handling)
        securitySystem.deactivateFireAlarm();

        // Turn off the lights
        lightingControl.turnOffLights();

        // Try to turn off the lights again (error handling)
        lightingControl.turnOffLights();
    }
}
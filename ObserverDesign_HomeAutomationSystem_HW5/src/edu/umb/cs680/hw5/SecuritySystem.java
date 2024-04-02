package edu.umb.cs680.hw5;

class SecuritySystem extends Observable<String> {
    private boolean isArmed = false;
    private boolean isFireAlarmActivated = false;

    public void arm() {
        if (!isArmed) {
            isArmed = true;
            notifyObservers("Security System is armed.");
        } else {
            notifyObservers("Security System is already armed.");
        }
    }

    public void disarm() {
        if (isArmed) {
            isArmed = false;
            notifyObservers("Security System is disarmed.");
        } else {
            notifyObservers("Security System is already disarmed.");
        }
    }

    public void triggerAlarm() {
        if (isArmed) {
            notifyObservers("Intruder alert! Alarm triggered.");
        } else {
            notifyObservers("Cannot trigger alarm - Security System is disarmed.");
        }
    }

    public void activateFireAlarm() {
        if (isArmed) {
            isFireAlarmActivated = true;
            notifyObservers("Fire alarm activated!");
        } else {
            notifyObservers("Cannot activate fire alarm - Security System is disarmed.");
        }
    }

    public void deactivateFireAlarm() {
        isFireAlarmActivated = false;
        notifyObservers("Fire alarm deactivated.");
    }
}
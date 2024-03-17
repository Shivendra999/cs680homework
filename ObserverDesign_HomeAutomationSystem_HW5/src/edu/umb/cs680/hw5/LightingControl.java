package edu.umb.cs680.hw5;


class LightingControl extends Observable<String> {
    private boolean isLightsOn = false;

    public void turnOnLights() {
        if (!isLightsOn) {
            isLightsOn = true;
            notifyObservers("Lights are on.");
        } else {
            notifyObservers("Lights are already on.");
        }
    }

    public void turnOffLights() {
        if (isLightsOn) {
            isLightsOn = false;
            notifyObservers("Lights are off.");
        } else {
            notifyObservers("Lights are already off.");
        }
    }
}
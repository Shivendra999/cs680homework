package edu.umb.cs680.hw5;


class UserDevice implements Observer<String> {
    private String deviceName;
    private String lastNotification;

    public UserDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(Observable<String> sender, String event) {
        lastNotification = deviceName + ": " + event;
        System.out.println(lastNotification);
    }

    public String getLastNotification() {
        return lastNotification;
    }
}
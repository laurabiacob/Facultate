package personal.ex.DevicesClass;

import personal.ex.DevicesClass.Chargeable;

public class Laptop implements Chargeable {
    private int batteryLevel;

    public Laptop(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void charge(int duration) {
        int chargingSpeed = 2;
        batteryLevel = Math.min(100, batteryLevel + (duration * chargingSpeed));
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

package personal.ex.DevicesClass;

public class SmartWatch implements Chargeable{
    private int batteryLevel;

    public SmartWatch(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void charge(int duration) {
        int chargingSpeed = 5; // charges 5% per 10 minutes
        batteryLevel = Math.min(100, batteryLevel + (duration * chargingSpeed));
    }
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

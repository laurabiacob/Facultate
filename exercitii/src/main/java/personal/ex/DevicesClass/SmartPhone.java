package personal.ex.DevicesClass;

public class SmartPhone implements Chargeable {
    private int batteryLevel;
    public SmartPhone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    @Override
    public void charge(int duration) {
        int chargingSpeed = 10; // charges 10% per 10 minutes
        batteryLevel = Math.min(100, batteryLevel + (duration * chargingSpeed));
    }
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

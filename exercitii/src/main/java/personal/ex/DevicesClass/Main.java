package personal.ex.DevicesClass;

import personal.ex.DevicesClass.Chargeable;

public class Main {
    public static void main(String[] args) {
        Chargeable[] devices={
                new SmartPhone(50),
                new Laptop(85),
                new SmartWatch(63)
        };
        for (Chargeable device : devices) {
            System.out.println("Device: " + device.getClass().getSimpleName());
            System.out.println("Initial battery level: " + device.getBatteryLevel() + "%");

            device.charge(600); // charge for 10 hours

            System.out.println("Battery level after charging: " + device.getBatteryLevel() + "%");
            System.out.println();
        }
    }
}

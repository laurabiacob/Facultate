package personal.ex.SensorsClass;

public abstract class Sensor {
    private String name;
    private String installLocation;

    public Sensor(String name, String installLocation) {
        this.name = name;
        this.installLocation = installLocation;
    }
    public String getName() {
        return name;
    }
    public String getInstallLocation() {
        return installLocation;
    }
    public abstract double getMeasurement();
}

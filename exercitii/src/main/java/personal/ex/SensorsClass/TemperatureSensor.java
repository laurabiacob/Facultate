package personal.ex.SensorsClass;

public class TemperatureSensor extends Sensor{
    private double temperature;

    public TemperatureSensor(String name, String installLocation) {
        super(name, installLocation);
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return temperature;
    }
    @Override
    public double getMeasurement() {
        return temperature;
    }
}

package personal.ex.SensorsClass;

public class PressureSensor extends Sensor{
    private double pressure;

    public PressureSensor(String name, String installLocation) {
        super(name, installLocation);
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    public double getPressure() {
        return pressure;
    }
    @Override
    public double getMeasurement() {
        return pressure;
    }
}

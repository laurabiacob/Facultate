package personal.ex.SensorsClass;

import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors;

    public MonitoringService() {
        this.sensors = new ArrayList<>();
    }
    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }
    public List<Sensor> getSensors() {
        return sensors;
    }
    public double getAverageAllSensors() {
        if (sensors.isEmpty()) {
            return 0.0;
        }
        double totalTemperature = 0.0;
        int temperatureSensorsCount = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                totalTemperature += ((TemperatureSensor) sensor).getTemperature();
                temperatureSensorsCount++;
            }
        }
        if (temperatureSensorsCount == 0) {
            return 0.0;
        }
        return totalTemperature / temperatureSensorsCount;
    }
    public double getAverageTemperatureSensors() {
        if (sensors.isEmpty()) {
            return 0.0;
        }
        double totalTemperature = 0.0;
        int temperatureSensorsCount = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                totalTemperature += ((TemperatureSensor) sensor).getTemperature();
                temperatureSensorsCount++;
            }
        }
        if (temperatureSensorsCount == 0) {
            return 0.0;
        }
        return totalTemperature / temperatureSensorsCount;
    }
}
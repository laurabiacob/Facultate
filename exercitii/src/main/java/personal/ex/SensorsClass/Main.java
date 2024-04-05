package personal.ex.SensorsClass;

public class Main {
    public static void main(String[] args) {
        MonitoringService monitoringService = new MonitoringService();

        monitoringService.addSensor(new TemperatureSensor("Living room", "Living room temperature sensor"));
        monitoringService.addSensor(new PressureSensor("Kitchen", "Kitchen pressure sensor"));
        monitoringService.addSensor(new TemperatureSensor("Bedroom", "Bedroom temperature sensor"));

        ((TemperatureSensor) monitoringService.getSensors().get(0)).setTemperature(25.5);
        ((PressureSensor) monitoringService.getSensors().get(1)).setPressure(1013.2);
        ((TemperatureSensor) monitoringService.getSensors().get(2)).setTemperature(22.3);

        System.out.println("Average of all sensors: " + monitoringService.getAverageAllSensors());

        System.out.println("Average of all temperature sensors: " + monitoringService.getAverageTemperatureSensors());
    }
}

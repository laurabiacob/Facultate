package personal.ex.AutoRegistry;

import java.util.HashSet;
import java.util.*;

public class VehicleManager {
    private HashSet <Vehicle> vehicles;
    public VehicleManager(){
        vehicles = new HashSet<Vehicle>();
    }
    public boolean addVehicle(Vehicle vehicle) {
        return vehicles.add(vehicle);
    }
    public boolean removeVehicle(Vehicle vehicle) {
        return vehicles.remove(vehicle);
    }
    public boolean searchByVIN(String VIN){
        return vehicles.contains(new Vehicle(VIN,"","","",0));
    }
    public Vehicle getByVIN(String VIN){
        for (Vehicle vehicle : vehicles)
            if(vehicle.getVIN().equalsIgnoreCase(VIN))
                return vehicle;
        return null;
    }
    public void displayAllVehicles() {
        System.out.println("All vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

}

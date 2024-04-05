package personal.ex.AutoRegistry;

public class Main {
    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        Vehicle vehicle1 = new Vehicle("252","CJ 85 ABC","Toyota","Supra",2020);
        Vehicle vehicle2 = new Vehicle("222","SM 25 CDF","Ford","Focus",2014);
        Vehicle vehicle3 = new Vehicle("263","CJ 07 FGB","Honda","Civic",2022);

        vehicleManager.addVehicle(vehicle1);
        vehicleManager.addVehicle(vehicle2);
        vehicleManager.addVehicle(vehicle3);

        vehicleManager.displayAllVehicles();
        boolean removed = vehicleManager.removeVehicle(vehicle2);
        if(removed){
            System.out.println("\nVehicle " + vehicle3.getLicensePlate() + " removed.");
        }
        vehicleManager.displayAllVehicles();
        Vehicle getByVin= vehicleManager.getByVIN("252");
        System.out.println("Vehicle with said VIN: "+ getByVin.toString());
        boolean searchByVin = vehicleManager.searchByVIN("268");
        System.out.println("Searched VIN: " + searchByVin);
    }
}

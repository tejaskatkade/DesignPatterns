package null_object;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        getVehicleDetails(vehicle);
    }

    static void getVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity "+vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity "+vehicle.getTankCapacity());
    }
}

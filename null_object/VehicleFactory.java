package null_object;

public class VehicleFactory {
    public static Vehicle getVehicleObject(String vehicleType){
        if( vehicleType.equals("Car")){
            return new Car();
        }
        return new NullVehicle();
    }
}

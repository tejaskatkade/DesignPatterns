public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle1 = new SportyVehicle();
        vehicle1.drive();
        
        Vehicle vehicle2 = new GoodsVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new PassengerVehicle();
        vehicle3.drive();

        Vehicle vehicle4 = new OffRoadVehicle();
        vehicle4.drive();
    }
}

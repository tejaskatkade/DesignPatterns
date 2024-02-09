import strategy.NormalDrive;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(){
        super(new NormalDrive());
    }
}

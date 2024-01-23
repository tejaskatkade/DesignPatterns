package adapter;

public class Adapter implements ICharger{

    public ACharger aCharger;

    public Adapter(ACharger aCharger){
        this.aCharger = aCharger;
    }

    @Override
    public void charging() {
        aCharger.charging();
        System.out.println("Using adapter...");
    }
    
}

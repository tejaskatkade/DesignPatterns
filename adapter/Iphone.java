package adapter;

public class Iphone {
    private ICharger charger;

    public Iphone(ICharger charger){
        this.charger = charger;
    }
    
    public void charge(){
        System.out.print("Iphone ");
        charger.charging();
    }
}

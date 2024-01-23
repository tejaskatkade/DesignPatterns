package adapter;

public class Client {
    public static void main(String[] args) {

        
        // Charging Iphone 
        // way 1:  Using apple charger

        ICharger iCharger = new AppleCharger();
        Iphone iphone = new Iphone(iCharger);
        iphone.charge();


        // // Charging Iphone 
        // // way 2:  Using Android charger charger + Adaptor 
         
        // ACharger aCharger = new AndroidCharger();
        // Adapter adapter = new Adapter(aCharger);
        // Iphone iphone = new Iphone(adapter);
        // iphone.charge();
            
    }
    
}

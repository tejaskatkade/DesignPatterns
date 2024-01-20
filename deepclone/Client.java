package deepclone;

public class Client {
    public static void main(String[] args) {
        
        Burger burger = new Burger(99);
        BurgerKing burgerKing = new BurgerKing(29, 3, burger);
      
        

        // Clonning
        BurgerKing burgerKing1 = null;
        try {

             burgerKing1 = (BurgerKing)burgerKing.clone();
        
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(burgerKing);
        System.out.println(burgerKing1);

        burgerKing.burger.price = 89;

        System.out.println(burgerKing);
        System.out.println(burgerKing1);


        


    }
}

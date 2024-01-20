package deepclone;

public class BurgerKing implements Cloneable{

    int  orderNo;
    int count;
    Burger burger;
    

    public BurgerKing(int orderNo, int count, Burger burger) {
        this.orderNo = orderNo;
        this.count = count;
        this.burger = burger;
    }

    
    @Override
    public String toString() {
        return "BurgerKing [orderNo=" + orderNo + ", count=" + count + ", burger=" + burger + "]";
    }
    
    // // shallow clonning
    // @Override
    // public Object clone()throws CloneNotSupportedException{
    //     return super.clone();
    // }
    
    // Deep clonning
    @Override
    public Object clone()throws CloneNotSupportedException{
        //Burger burger1 = new Burger();
        Burger burger1 = (Burger)burger.clone();
        return new BurgerKing(this.orderNo, this.count, burger1);        
    }
}

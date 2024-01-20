package deepclone;

public class Burger implements Cloneable{
    int price;

    Burger(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "[price=" + price + "]";
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}

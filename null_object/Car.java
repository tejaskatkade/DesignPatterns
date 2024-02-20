package null_object;

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
       return 50;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
    
}

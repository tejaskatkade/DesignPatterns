import java.io.Serializable;

public class Singleton1 implements Serializable, Cloneable{

    private Singleton1(){
        
    }
    //Eager way  :
    private static Singleton1 singlton = new Singleton1();
    // object is created when this class is loaded. NO matter you have its requirement or not. 
    
    public static Singleton1 getObject(){
        return singlton;
    }

    //solution 
        // Implement readResolve()  method
        public Object readResolve(){
            return singlton;
        }


    //way 3 (to break singleton)

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

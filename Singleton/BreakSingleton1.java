import java.lang.reflect.Constructor;

public class BreakSingleton1 {
    public static void main(String[] args)throws Exception {
     
        //way 1. Reflection API

        Singleton1 s1 = Singleton1.getObject();
        System.out.println(s1);

        
        Constructor<Singleton1> constructor = Singleton1.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton1 s2 = constructor.newInstance();
        System.out.println(s2);

        // solution 1: If object is already created then we can throw exception from constructor
        
        // private Singleton1(){
        //     if(singlton != null){
        //         throw new RuntimeException("You can not create more than one object");
        //     }
        // } 

        // solution 2: Use Enum

        //  public enum Singleton1{
        //     INSTANCE;
        // }

    }
}

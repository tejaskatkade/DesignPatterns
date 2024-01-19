package singleton;
public class Singleton2 {
    private static Singleton2 singleton;
    private Singleton2(){

    }

    // Lazy way to create Singleton

    // It get fails in Multithreading environment
    // In case of Multithreading  you have to use "synchronized" keyword. 
    // Or we can also use synchronesed block only for the if condition
    public static Singleton2 getObject(){
        
        if(singleton == null){
            singleton = new Singleton2(); 
        }
        return singleton;
    }
}

package singleton;
// way 3 - use of clone() method
// The object to be clone needs to be cloneable

public class BreakSingleton3 {

    public static void main(String[] args)throws CloneNotSupportedException{
       
        Singleton1 obj1 = Singleton1.getObject();
        System.out.println(obj1);

        Singleton1 obj2 = (Singleton1)obj1.clone();
        System.out.println(obj2);

    }
    // clone() method of object class is protected
    // so need to override in our class

    // solution
    // override clone method and return the created object only
    

    
}

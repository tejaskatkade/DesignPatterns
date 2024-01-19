package singleton;
public class Singleton {
    public static void main(String[] args) throws Exception {
        System.out.println("Singleton Design Pattern");
        
        System.out.println("Way 1");
        System.out.println(Singleton1.getObject());
        System.out.println(Singleton1.getObject());
        
        System.out.println("Way 2");
        System.out.println(Singleton2.getObject());
        System.out.println(Singleton2.getObject());
        
    }
}

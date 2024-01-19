package singleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakSingleton2 {
    
    public static void main(String[] args)throws Exception{
        //way 2: Deserialization

        
        Singleton1 obj1 = Singleton1.getObject();
        System.out.println(obj1);

        //serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
        oos.writeObject(obj1);
        
        

        //deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        Singleton1 obj2 = (Singleton1)ois.readObject();
        System.out.println(obj2);

        oos.close();
        ois.close();

        //solution 
        // Implement readResolve()  method
    }
}

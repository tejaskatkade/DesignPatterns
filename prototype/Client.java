package prototype;

public class Client {
    public static void main(String[] args) {
        
        // here, Creating object of NetworkConnection is heavy task
        // creating the object 

        NetworkConnection networkConnection1 = new NetworkConnection();
        networkConnection1.setIp("123.12.12");
        networkConnection1.setData("data.exe");
        
        networkConnection1.loadData();
        System.out.println(networkConnection1);

        // now instead of creating again new object we are clonnig already creted object

        NetworkConnection networkConnection2 = null;
        try {

             networkConnection2 = (NetworkConnection)networkConnection1.clone();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(networkConnection2);

    }
}

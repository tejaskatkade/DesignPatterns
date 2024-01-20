package observer;

public class Client {
    public static void main(String[] args) {
        
        Channels channels = new Channels("Code with Harry");

        Subscribers subscriber1 = new Subscribers("tejas");
        Subscribers subscriber2 = new Subscribers("prashant");
        Subscribers subscriber3 = new Subscribers("virat");

        channels.subscribe(subscriber1);
        channels.subscribe(subscriber2);
        channels.subscribe(subscriber3);


        channels.uploadVideo("How to get job");

        channels.unSubscribe(subscriber3);
    


                    
    }
}

        

        // System.out.println("Welcome to YouTube");
        // System.out.println("Select Your Choice");
        // System.out.println("1. Create a Channel");
        // System.out.println("2. Subscribe Channel");
        // System.out.println("3. Unsubscribe Channel");
        // System.out.println("4. Upload Video");

        // Scanner sc = new Scanner(System.in);
        // int choice = sc.nextInt();
        // Channels channels;
        // switch (choice) {
        //     case 1:
        //         {
        //             System.out.println("Enter Channel Name");
        //             String channel = sc.nextLine();
        //             channels = new Channels(channel);
        //         }   
        //         break;
        //     case 2:
        //         {
        //             System.out.println("Enter Channel Name");
        //             String channel = sc.nextLine();
        //             channels.subscribe(new observer());
        //         }   
        //         break;
        
        //     default:
        //         break;
        // }
        


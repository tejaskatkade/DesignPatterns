package observer;


public class Subscribers implements Observer {

    //private int subscriberId;
    private String useName;

    Subscribers(String userName){
        this.useName = userName;
    }

    @Override
    public void getNotifiacation(String videoTitle) {
        System.out.println("Notifiacation..\nHello "+useName+" "+ videoTitle+" Video is Uploaded ..");
    }

    
    
}

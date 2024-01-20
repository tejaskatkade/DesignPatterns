package observer;

import java.util.ArrayList;
import java.util.List;

public class Channels implements YoutubeChannel {

    String name;

    Channels(String name){
        this.name = name;
    }

    List<Observer> list = new ArrayList<>();
    
    @Override
    public void subscribe(Observer ob) {
        list.add(ob);
    }

    @Override
    public void uploadVideo(String videoTitle) {
           System.out.println(videoTitle + "has uploaded Successfully");
           notifySubscribers(videoTitle);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for(Observer ob : list){
            ob.getNotifiacation(videoTitle);
        }
    }

    @Override
    public void unSubscribe(Observer observer) {
        list.remove(observer);
    }
    
}

package observer;

public interface YoutubeChannel {
    
    public void subscribe(Observer observer);
    public void unSubscribe(Observer observer);
    public void uploadVideo(String string);
    public void notifySubscribers(String string);
    
}
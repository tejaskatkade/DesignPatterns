package observer2.observer;

import observer2.observal.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    private String mobileNo;
    private StockObservable observable;
     
    public MobileAlertObserver(String mobileNo, StockObservable observable) {
        this.mobileNo = mobileNo;
        this.observable = observable;
    }
    
    @Override
    public void update() {
        System.out.println("Message sent to "+mobileNo+"\nYour "+observable.toString() +" is in stock Hurry Up !!");
    }
    
}
package observer2.observer;

import observer2.observal.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    private String emailId;
    private StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

   

    @Override
    public void update() {
        System.out.println("Mail sent to "+ emailId+"\n"+observable.toString()+" is in stock Hurry up !!!");
    }
    
}

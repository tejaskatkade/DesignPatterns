package observer2.observal;

import java.util.ArrayList;
import java.util.List;

import observer2.observer.NotificationAlertObserver;

public class Iphone implements StockObservable {

    private int stockCount = 0;
    private List<NotificationAlertObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifySubscriber() {
        
        for (NotificationAlertObserver observers : observerList) {
            observers.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            System.out.println("Notifying All Subscribers !!!");
            notifySubscriber();
        }
        stockCount = stockCount + newStockCount;
        //System.out.println("Stock Count is :"+stockCount);
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public String toString() {
        return "Iphone";
    }
    
}

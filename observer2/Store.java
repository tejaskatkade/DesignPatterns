package observer2;

import observer2.observal.Iphone;
import observer2.observal.StockObservable;
import observer2.observal.Watch;
import observer2.observer.EmailAlertObserver;
import observer2.observer.MobileAlertObserver;
import observer2.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        
        StockObservable iphone = new Iphone();
        StockObservable watch = new Watch();

        NotificationAlertObserver observer1 = new EmailAlertObserver("tejasKatkade@gmail.com", iphone);
        NotificationAlertObserver observer2 = new MobileAlertObserver("2345678901", iphone);
        NotificationAlertObserver observer3 = new EmailAlertObserver("tejasKatkade@gmail.com", iphone);
        NotificationAlertObserver observer4= new MobileAlertObserver("9078563412", iphone);
        NotificationAlertObserver observer5 = new EmailAlertObserver("tejasKatkade@gmail.com", watch);
        NotificationAlertObserver observer6 = new MobileAlertObserver("9078563412", watch);
        NotificationAlertObserver observer7 = new EmailAlertObserver("tejasKatkade@gmail.com", watch);
        NotificationAlertObserver observer8 = new MobileAlertObserver("9078563412", watch);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);
        iphone.add(observer4);

        watch.add(observer5);
        watch.add(observer6);
        watch.add(observer7);
        watch.add(observer8);
        

        System.out.println("setting Iphone stock cout = 5");
        iphone.setStockCount(5);

        System.out.println("____________________________________________");
        System.out.println("");
        
        System.out.println("setting Iphone stock cout = 0");
        iphone.setStockCount(-5);
        
        System.out.println("____________________________________________");
        System.out.println("");
        
        System.out.println("setting Iphone stock cout = 15");
        iphone.setStockCount(15);

        System.out.println("____________________________________________");
        System.out.println("");

        System.out.println("setting Watch stock cout = 25");
        watch.setStockCount(25);
        
        System.out.println("____________________________________________");
        System.out.println("");

        System.out.println("setting Watch stock cout = 0");
        watch.setStockCount(-25);
        
        System.out.println("____________________________________________");
        System.out.println("");

        System.out.println("setting Watch stock cout = 1");
        watch.setStockCount(1);



    }
}

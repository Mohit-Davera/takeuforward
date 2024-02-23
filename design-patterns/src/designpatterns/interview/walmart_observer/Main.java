package designpatterns.interview.walmart_observer;

import designpatterns.interview.walmart_observer.obeserver.EmailAlertObserver;
import designpatterns.interview.walmart_observer.obeserver.ItemObserver;
import designpatterns.interview.walmart_observer.obeserver.SmsAlertObserver;
import designpatterns.interview.walmart_observer.observable.IphoneStockObservableImpl;

public class Main {
    public static void main(String[] args) {
        IphoneStockObservableImpl stockObservable = new IphoneStockObservableImpl();

        ItemObserver alertOne = new EmailAlertObserver(stockObservable,"md@gmail.com");
        ItemObserver alertTwo = new EmailAlertObserver(stockObservable,"avi@gmail.com");
        ItemObserver alertThree = new SmsAlertObserver(stockObservable,"456-475-1011");

        stockObservable.add(alertOne);
        stockObservable.add(alertTwo);
        stockObservable.add(alertThree);

        stockObservable.setData(10);
        stockObservable.setData(0);
        stockObservable.setData(100);
    }
}

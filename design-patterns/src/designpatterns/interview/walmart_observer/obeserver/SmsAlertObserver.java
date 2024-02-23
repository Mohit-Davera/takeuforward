package designpatterns.interview.walmart_observer.obeserver;

import designpatterns.interview.walmart_observer.observable.StockObservable;

public class SmsAlertObserver implements ItemObserver {

    StockObservable stockObservable;
    String phoneNumber;

    public SmsAlertObserver(StockObservable stockObservable, String phoneNumber) {
        this.stockObservable = stockObservable;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Sms Sent " + phoneNumber + " Latest stock count: " + stockObservable.getData() );

        //code for sending sms alert;
    }
}

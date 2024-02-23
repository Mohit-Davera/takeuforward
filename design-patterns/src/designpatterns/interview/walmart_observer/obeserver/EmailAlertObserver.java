package designpatterns.interview.walmart_observer.obeserver;

import designpatterns.interview.walmart_observer.observable.StockObservable;

public class EmailAlertObserver implements ItemObserver{

    StockObservable stockObservable;
    String email;

    public EmailAlertObserver(StockObservable stockObservable, String email) {
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Email Sent " + email + " Latest stock count: " + stockObservable.getData() );

        //code for sending mail alert;
    }
}

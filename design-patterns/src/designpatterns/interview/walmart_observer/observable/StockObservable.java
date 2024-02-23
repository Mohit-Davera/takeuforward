package designpatterns.interview.walmart_observer.observable;

import designpatterns.interview.walmart_observer.obeserver.ItemObserver;

public interface StockObservable {
    void add(ItemObserver itemObserver);

    void remove(ItemObserver itemObserver);

    void notifySubscribers();

    void setData(int data);

    int getData();

}

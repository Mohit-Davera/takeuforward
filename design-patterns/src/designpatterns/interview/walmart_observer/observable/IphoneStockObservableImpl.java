package designpatterns.interview.walmart_observer.observable;

import designpatterns.interview.walmart_observer.obeserver.ItemObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable {

    List<ItemObserver> observers = new ArrayList<>();

    int stockQuantity = 0;

    @Override
    public void add(ItemObserver itemObserver) {
        observers.add(itemObserver);
    }

    @Override
    public void remove(ItemObserver itemObserver) {
        observers.remove(itemObserver);
    }

    @Override
    public void notifySubscribers() {
        for (ItemObserver itemObserver :
                observers) {
            itemObserver.update();
        }
    }

    @Override
    public void setData(int newStock) {
        boolean wasStockEmpty = stockQuantity == 0;
        stockQuantity = newStock;
        if(wasStockEmpty){
            notifySubscribers();
        }
    }

    @Override
    public int getData() {
        return stockQuantity;
    }
}

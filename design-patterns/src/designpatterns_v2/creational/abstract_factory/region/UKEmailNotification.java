package designpatterns_v2.creational.abstract_factory.region;

import designpatterns_v2.creational.abstract_factory.EmailNotification;

public class UKEmailNotification implements EmailNotification {
    @Override
    public void notifyUser() {
        System.out.println("Format: 24h time, Footer: UK");
    }
}

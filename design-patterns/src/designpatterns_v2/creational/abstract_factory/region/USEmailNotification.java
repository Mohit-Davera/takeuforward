package designpatterns_v2.creational.abstract_factory.region;

import designpatterns_v2.creational.abstract_factory.EmailNotification;

public class USEmailNotification implements EmailNotification {
    @Override
    public void notifyUser() {
        System.out.println("Format: 12h time, Footer: USA");
    }
}

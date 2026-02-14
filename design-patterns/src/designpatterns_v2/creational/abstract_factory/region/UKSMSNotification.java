package designpatterns_v2.creational.abstract_factory.region;

import designpatterns_v2.creational.abstract_factory.SMSNotification;

public class UKSMSNotification implements SMSNotification {
    @Override
    public void notifyUser() {
        System.out.println("SMS UK +44 Prefix");
    }
}

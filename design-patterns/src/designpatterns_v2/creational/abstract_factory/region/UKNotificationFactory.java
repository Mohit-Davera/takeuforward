package designpatterns_v2.creational.abstract_factory.region;

import designpatterns_v2.creational.abstract_factory.EmailNotification;
import designpatterns_v2.creational.abstract_factory.GlobalNotificationFactory;
import designpatterns_v2.creational.abstract_factory.SMSNotification;

public class UKNotificationFactory implements GlobalNotificationFactory {
    @Override
    public EmailNotification createEmail() {
        return new UKEmailNotification();
    }

    @Override
    public SMSNotification createSMS() {
        return new UKSMSNotification();
    }
}

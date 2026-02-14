package designpatterns_v2.creational.abstract_factory.region;

import designpatterns_v2.creational.abstract_factory.EmailNotification;
import designpatterns_v2.creational.abstract_factory.GlobalNotificationFactory;
import designpatterns_v2.creational.abstract_factory.SMSNotification;

public class USNotificationFactory implements GlobalNotificationFactory {
    @Override
    public EmailNotification createEmail() {
        return new USEmailNotification();
    }

    @Override
    public SMSNotification createSMS() {
        return new USSMSNotification();
    }
}

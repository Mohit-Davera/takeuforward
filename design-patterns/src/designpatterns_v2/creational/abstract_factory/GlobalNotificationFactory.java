package designpatterns_v2.creational.abstract_factory;

public interface GlobalNotificationFactory {
    EmailNotification createEmail();
    SMSNotification createSMS();
}

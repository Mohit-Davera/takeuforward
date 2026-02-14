package designpatterns_v2.creational.factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS: Your package has arrived!");
    }
}

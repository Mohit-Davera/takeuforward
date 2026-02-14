package designpatterns_v2.creational.factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Push Notification: Your package has arrived!");
    }
}
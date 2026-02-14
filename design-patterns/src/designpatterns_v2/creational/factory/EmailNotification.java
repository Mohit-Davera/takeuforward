package designpatterns_v2.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email: Your package has arrived!");
    }
}

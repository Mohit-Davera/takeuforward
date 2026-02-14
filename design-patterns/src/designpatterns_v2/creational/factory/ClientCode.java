package designpatterns_v2.creational.factory;

public class ClientCode {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification n = notificationFactory.createNotification("SMS");
        Notification n1 = notificationFactory.createNotificationRegistry("SMS");
        n.notifyUser();
        n1.notifyUser();
    }

    public void main2(){
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification n1 = notificationFactory.createNotificationRegistry("SMS");
        n1.notifyUser();
    }
}

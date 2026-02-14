package designpatterns_v2.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

    static Map<String, Supplier<Notification>> REGISTRY = new HashMap<>();
    static {
        REGISTRY.put("SMS", SMSNotification::new);
        REGISTRY.put("EMAIL", EmailNotification::new);
        REGISTRY.put("PUSH", PushNotification::new);
    }
    Notification createNotification(String type){
        if("SMS".equalsIgnoreCase(type)){
            return new SMSNotification();
        }
        else if("PUSHNOTIFICATION".equalsIgnoreCase(type)){
            return new PushNotification();
        }
        else if("EMAIL".equalsIgnoreCase(type)){
            return new EmailNotification();
        }
        throw new IllegalArgumentException();
    }

    public Notification createNotificationRegistry(String type) throws IllegalArgumentException{
        if (type == null) {
            throw new IllegalArgumentException("Notification type cannot be null");
        }

        Supplier<Notification> supplier = REGISTRY.get(type.toUpperCase());

        if (supplier == null) {
            throw new IllegalArgumentException("Unknown notification type: " + type);
        }

        return supplier.get();
    }
}

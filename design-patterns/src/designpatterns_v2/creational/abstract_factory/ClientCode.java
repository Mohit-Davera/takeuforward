package designpatterns_v2.creational.abstract_factory;

import designpatterns_v2.creational.abstract_factory.region.RegionalDispatcher;

public class ClientCode {
    public static void main(String[] args) {
        RegionalDispatcher rg = new RegionalDispatcher();
        GlobalNotificationFactory usaNotificationFactory = rg.getRegionalService("USA");
        usaNotificationFactory.createEmail().notifyUser();
        usaNotificationFactory.createSMS().notifyUser();



        //user2
        GlobalNotificationFactory ukNotificationFactory = rg.getRegionalService("UK");
        ukNotificationFactory.createEmail().notifyUser();
        ukNotificationFactory.createSMS().notifyUser();
    }
}

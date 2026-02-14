package designpatterns_v2.creational.abstract_factory.region;

import designpatterns_v2.creational.abstract_factory.GlobalNotificationFactory;

public class RegionalDispatcher {
    public GlobalNotificationFactory getRegionalService(String region){
        if("USA".equalsIgnoreCase(region)){
            return new USNotificationFactory();
        }
        if("UK".equalsIgnoreCase(region)){
            return new UKNotificationFactory();
        }
        throw new IllegalArgumentException();
    }
}

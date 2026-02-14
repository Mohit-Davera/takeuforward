package designpatterns_v2.structural.adapter.class_level;

public class XMLService {
    public XML getXMLData(){
        return new XML("TEST XML DATA");
    }
}

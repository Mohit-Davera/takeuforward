package designpatterns_v2.structural.adapter.obj_level;

public class XMLService {
    public XML getXMLData(){
        return new XML("TEST XML DATA");
    }
}

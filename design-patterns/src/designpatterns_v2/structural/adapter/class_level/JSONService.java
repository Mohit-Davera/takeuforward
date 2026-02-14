package designpatterns_v2.structural.adapter.class_level;

public class JSONService {

    private static String key = "TEST XML DATA";
    public boolean checkJSONDataWithXML(JSON json){
        return key.equalsIgnoreCase(json.getData());
    }
}

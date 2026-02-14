package designpatterns_v2.structural.adapter.class_level;

public class ClassAdapterXMLToJSON extends XMLService implements IJsonProcessor {

    @Override
    public JSON getConvertedData() {
        // We call getXMLData() directly because we EXTENDED XMLService
        XML xml = getXMLData();

        // Translation logic
        JSON json = new JSON();
        json.setData(xml.getData());

        System.out.println("Class Adapter: Successfully translated XML to JSON");
        return json;
    }
}

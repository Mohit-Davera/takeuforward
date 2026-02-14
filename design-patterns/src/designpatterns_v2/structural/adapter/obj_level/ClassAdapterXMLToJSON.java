package designpatterns_v2.structural.adapter.obj_level;


public class ClassAdapterXMLToJSON implements IJsonProcessor {

    XMLService xmlService;

    public ClassAdapterXMLToJSON(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public JSON getConvertedData() {
        // We call getXMLData() directly because we EXTENDED XMLService
        XML xml = xmlService.getXMLData();

        // Translation logic
        JSON json = new JSON();
        json.setData(xml.getData());

        System.out.println("Class Adapter: Successfully translated XML to JSON");
        return json;
    }
}

package designpatterns_v2.structural.adapter.class_level;

public class ClientCode {

    public static void main(String[] args) {
        // The adapter acts as the target interface
        IJsonProcessor processor = new ClassAdapterXMLToJSON();

        // The client simply asks for data in the format it understands
        JSON result = processor.getConvertedData();

        JSONService service = new JSONService();
        service.checkJSONDataWithXML(result);
    }
}

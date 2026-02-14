package designpatterns_v2.structural.adapter.class_level;

public class JSON {
    private String data;

    public JSON() {
    }

    public JSON(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

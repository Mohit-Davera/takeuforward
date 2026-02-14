package designpatterns_v2.structural.adapter.obj_level;

class XML {
    private String data;

    public XML(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

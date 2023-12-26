package testing;

class ListNOde {
    public int data;
    public ListNOde next;

    public ListNOde() {
    }

    public ListNOde(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNOde getNext() {
        return next;
    }

    public void setNext(ListNOde next) {
        this.next = next;
    }
}
package striver.binary;

public class Pair {
    int floor,ceil;

    public Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCeil() {
        return ceil;
    }

    public void setCeil(int ceil) {
        this.ceil = ceil;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "floor=" + floor +
                ", ceil=" + ceil +
                '}';
    }
}

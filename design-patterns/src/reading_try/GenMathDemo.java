package reading_try;

public class GenMathDemo {

    public static <T, V extends T> boolean isIn(T t, V[] v) {
        for (V i :
                v) {
            if (i.equals(t))
                return true;
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        boolean in = GenMathDemo.isIn(1, ints);
        Test<?> gens[] = new Test<?>[10];
    }
}

class Test<T> {
    T ob;

    T getOb() {
        return ob;
    }
}

package innerclass;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        System.out.println(Arrays.toString(outer.getFilesInDir("src/com/journaldev/nested", ".java")));


    }
}

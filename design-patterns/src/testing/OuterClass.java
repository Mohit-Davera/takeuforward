package testing;

public class OuterClass {
    public static class InnerClass {
        public String inner() {
            int a = 10;
            return a + "";
        }
    }
}

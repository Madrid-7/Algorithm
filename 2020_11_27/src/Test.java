class A {
    A (int a) {

    }

    A (float a) {
        this(12);
    }
}

public class Test {

    static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a, b);

        System.out.println(a + "." + b);
    }
}

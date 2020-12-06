public class Test {
    public void add(Byte b) {
        b = b++;
    }
    public void test() {
        Byte a = 127;
        Byte b = 127;
        Byte c = 127;
        add(++a);
        System.out.println(a+" ");
        add(b);
        System.out.println(b+" ");
        System.out.println(++c);

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }
}

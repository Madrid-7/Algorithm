class A {
    A () {
        System.out.println("xx");
    }
}

class B extends A {

}


public class Test extends A {

    public static boolean AA(String str) {
        return str.toLowerCase() == "aaa";
    }

    public static void main(String[] args) {
        new Test();
        new A();
    }
}











////public abstract class Test {
////    public abstract void method(int a);
////}
//
//abstract class T {
//    public T () {
//
//        System.out.println("?");
//    }
//
//    public T (int n) {
//        this();
//        System.out.println(n);
//
//    }
//
//    public abstract void fun();
//
//    public static void hello() {
//        System.out.println("??");
//    }
//
//}
//
//class A extends T {
//
//    public A (int n) {
//        super(n);
//    }
//
//    @Override
//    public void fun() {
//
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        T t = null;
//        t.hello();
//    }
//}

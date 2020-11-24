public class Test {
    public void fun () {

    }
    public static void main(String[] args) {
        String str = "hello";
        String s1 = "he" + new String("llo");
        String s2 = "he" + "llo";
        System.out.println(str == s1);
        System.out.println(str == s2);
    }
}

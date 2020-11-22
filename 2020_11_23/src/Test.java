public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("helloworld");
        System.out.println(sb.delete(5, 10).insert(0, "你好"));
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
//        sb.equals();
//        String str = "sad";
//        str.equals()
    }
}

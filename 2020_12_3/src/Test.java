public class Test {

    public static void main(String[] args) {
//        byte b1 = 1, b2 = 2, b3, b6;
//        final byte b4 = 4, b5 = 5;
//        b6 = b4 + b5;
//        b3 = (b1 + b2);

        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };

        System.out.println(o.equals("sad"));
    }
}

public class Test {
    static class A extends Thread {
        @Override

        public void run() {

            try {
                sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        A a = new A();

    }
}

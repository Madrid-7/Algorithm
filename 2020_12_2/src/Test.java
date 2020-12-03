public class Test {
    public static void main1() {
        String str = "asd";
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        ((Test)null).main1();

        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));


    }
}

class Person {
    String name = "No name";
    public Person(String nm) {
        this.name = nm;
    }
}

class Employee extends Person {
    String empID = "0000";
    public Employee (String id) {
        super("dsf");
        this.empID = id;
    }
}



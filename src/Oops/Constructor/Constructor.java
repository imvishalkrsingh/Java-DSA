package Oops.Constructor;

public class Constructor {

    public static class Person {
        private String name;
        private String college;
        private int rNumber;

        public Person(String naam, String school, int number) {
            name = naam;
            college = school;
            rNumber = number;
        }

        public static void main(String[] args) {
            Person p1 = new Person("vishal", "Sage", 1);
            System.out.println(p1.name);
            System.out.println(p1.college);
            System.out.println(p1.rNumber);
        }
    }
}

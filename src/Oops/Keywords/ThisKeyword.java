package Oops.Keywords;

/*
The 'this' keyword in Java is a reference variable that refers to the current object.
It is used to represent the instance of the class in which it appears.
 */
public class ThisKeyword {

    public class Person {
        String name;
        int age;
        String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    }

    public static void main(String[] args) {
        ThisKeyword.Person p1 = new ThisKeyword().new Person("Vishal", 24, "Male");

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.gender);
    }
}

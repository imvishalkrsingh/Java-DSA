package Oops.Basics;

class student{
    int age;
    String name;
}

public class classAndObject {
    public static void main(String[] args) {

        student object1 = new student();
        object1.age = 25;
        object1.name = "Vishal";

        System.out.println("Name of Student : "+object1.name);
        System.out.println("Age of Student : "+ object1.age);
    }
}

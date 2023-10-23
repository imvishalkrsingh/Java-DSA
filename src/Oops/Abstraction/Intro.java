package Oops.Abstraction;

public class Intro {

    public static void main(String[] args) {

        System.out.println("Horse........");
        Horse h = new Horse();
        System.out.println(h.color);
        h.eat();
        h.changeColor("Black");


        System.out.println("Deer........");
        Deer d = new Deer();
        System.out.println(d.color);
        d.eat();
        d.walk();
        d.changeColor("Yellow");

        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal Constructor Called");
    }

    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
    class Horse extends Animal{
        void changeColor(String color){
            this.color = color;
            System.out.println(color);
        }

        void walk(){
            System.out.println("Walks on Four legs");
        }
    }

    class Deer extends Animal{

        void walk(){
            System.out.println("Deer walks on 4 legs");
        }

        void changeColor(String color){
            this.color = color;
        }
    }
    /*
    Abstract Class in Java does the process of hiding
    the intricate code implementation details from the
    user and just provides the user with the necessary
    information. This phenomenon is called Data Abstraction
     in Object-Oriented Programming (Java).

     The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class,
and it does not have a body. The body is provided by the
subclass (inherited from).
     */


// Abstract class
abstract class Animals {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animals {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

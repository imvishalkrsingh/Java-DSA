package Oops.Inheritance;

public class Intro {


    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat();


        Dog dobby = new Dog();
        dobby.eat();

        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

//Base Class // Parent class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

//    Derived Class

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in Water");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}


/*
Types of Inheritance
1. Single level Inheritance
-- Base class -> Derived class
-- Parent class -> Child class

2. Multi level inheritance
-- Base class -> Derived class -> Derived class
-- Parent class -> child class -> child class

3. Hierarchical Inheritance
-- A class serves as a Base class for more than one Derived Class.
-- A -> B
-- A -> C
-- A -> D

4. Multiple Inheritance
-- One class can have more than one Base class and inherit features from all Parent classes.
Note -- Java doesn't support Multiple Inheritance with classes.
-- A - Base class
-- B - Base Class
-- C - Derived Class
-- A,B -> C

5. Hybrid Inheritance
-- A type of inheritance where a class extends two or more classes
-- A - Base Class
-- A -> B
-- A -> c
 */

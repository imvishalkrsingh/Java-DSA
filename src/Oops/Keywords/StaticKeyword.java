package Oops.Keywords;
/*
The static keyword in Java is mainly used for memory management.
The static keyword in Java is used to share the same variable or method of a given class.
The users can apply static keywords with variables, methods, blocks, and nested classes.
The static keyword belongs to the class than an instance of the class.
 */

public class StaticKeyword {

    // Inner class representing a Car
    public class Car {
        String company;
        String model;
        int price;
        static int carCount;  // Static variable to keep track of the number of cars

        // Constructor to initialize Car properties and increment carCount
        public Car(String company, String model, int price) {
            this.company = company;
            this.model = model;
            this.price = price;
            carCount++;  // Increment carCount each time a new Car is created
        }
    }

    public static void main(String[] args) {

        // Creating the first Car object
        StaticKeyword.Car c1 = new StaticKeyword().new Car("Mahindra", "Scorpio N", 2000000);
        System.out.println("Car 1 Details:");
        System.out.println("Company: " + c1.company);
        System.out.println("Model: " + c1.model);
        System.out.println("Price: " + c1.price);
        System.out.println("Total Cars: " + StaticKeyword.Car.carCount);  // Access carCount using the class name

        // Creating the second Car object
        StaticKeyword.Car c2 = new StaticKeyword().new Car("TATA", "Safari", 3000000);
        System.out.println("\nCar 2 Details:");
        System.out.println("Company: " + c2.company);
        System.out.println("Model: " + c2.model);
        System.out.println("Price: " + c2.price);
        System.out.println("Total Cars: " + StaticKeyword.Car.carCount);  // Access carCount using the class name
    }
}

// Sure thing! In Java, functions are called methods. Here's a basic example of a method in Java:

package Functions;

public class FunctionsBasic {

    static void hello(){
        System.out.println("Hello World..");
    }

    static void greet(String name){   // formal parameters/ parameter
        System.out.println("Hey " + name);
    }
    public static void main(String[] args) {

        hello();
        greet("Vishal Singh");   // Actual parameters/ Arguments

    }
}

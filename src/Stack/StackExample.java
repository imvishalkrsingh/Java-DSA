package Stack;
import java.util.Stack;
public class StackExample {

    public static void main(String[] args) {

        // create a stack
        Stack <String> stack = new Stack<>();

        // push element onto the stack
        stack.push("one");
        stack.push("two");
        stack.push("three");

        // Pop an element of the stack
        String removedItem = stack.pop();
        System.out.println("Removed Book : " + removedItem);

        // Peek at the top element
        String topBook = stack.peek();
        System.out.println("Top Book : " + topBook);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty ? : " + isEmpty);

    }
}

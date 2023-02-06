import java.util.Stack;

public class StackJavaExample {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);

        System.out.println("Pick : "+integerStack.peek());
        System.out.println("Pop : "+integerStack.pop());
        System.out.println("IsEmpty : "+integerStack.empty());
    }
}

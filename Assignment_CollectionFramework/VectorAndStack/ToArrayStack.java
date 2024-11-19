import java.util.Stack;

public class ToArrayStack {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        stack.push(4.4);
        stack.push(5.5);
        
        Double[] array = new Double[stack.size()];
        stack.copyInto(array);
        
        System.out.print("Array converted from stack: ");
        for (Double d : array) {
            System.out.print(d +" ");
        }
        System.out.println();
        
        Stack<Double> newStack = new Stack<>();
        for (Double d : array) {
            newStack.push(d);
        }
        
        System.out.println("New stack created from the array: " + newStack);
    }
}

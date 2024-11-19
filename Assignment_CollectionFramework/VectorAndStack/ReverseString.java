import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello malayalam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println("Reversed string: " + reversed);
    }
}

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input = "(())";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch == '(') {
                stack.push(ch);
            }
            else if (!stack.isEmpty() && ch == ')' && stack.peek()=='(') {
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) {
            System.out.println("Input is Balanced parantheses");
        }
        else{
           System.out.println("Not Balanced");
        }
    }
}

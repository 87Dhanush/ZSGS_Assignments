public class Calculator {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        try {
            switch (operation) {
                case "+":
                    return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                case "*":
                    return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                case "/":
                    if (operand2 == 0) {
                        throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
                    }
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (IllegalOperationException e) {
            throw e;
        } catch (Exception e) {
            throw new IllegalOperationException("An error occurred while performing the operation", e);
        }
    }

    public static class IllegalOperationException extends RuntimeException {
        public IllegalOperationException(String message) {
            super(message);
        }

        public IllegalOperationException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        try {
            System.out.println(calculator.calculate(16, 51, "+"));  
            System.out.println(calculator.calculate(32, 6, "*"));   
            System.out.println(calculator.calculate(512, 4, "/"));  
            System.out.println(calculator.calculate(512, 0, "/"));  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calculator.calculate(10, 1, null));  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calculator.calculate(10, 1, ""));    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calculator.calculate(10, 1, "-"));   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

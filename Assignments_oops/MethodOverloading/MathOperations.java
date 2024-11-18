public class MathOperations {

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(10, 5));
        System.out.println(math.add(10.5, 5.5));
        System.out.println(math.subtract(10, 5));
        System.out.println(math.subtract(10.5, 5.5));
        System.out.println(math.multiply(10, 5));
        System.out.println(math.multiply(10.5, 5.5));
        System.out.println(math.divide(10, 5));
        System.out.println(math.divide(10.5, 5.5));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

}

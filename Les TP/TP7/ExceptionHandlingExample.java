public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b; // This will throw an ArithmeticException
            System.out.println("The result is: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Programs continues after the catch block.");
    }
}
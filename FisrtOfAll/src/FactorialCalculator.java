public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 12; // Change this value to calculate factorial for a different number
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}

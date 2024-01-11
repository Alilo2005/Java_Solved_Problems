import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        real = 0;
        imaginary = 1;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.2f + %.2fi", real, imaginary);
        } else {
            return String.format("%.2f - %.2fi", real, -imaginary); // To handle negative imaginary parts
        }
    }

    public ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real + c.getReal(), imaginary + c.getImaginary());
    }

    public ComplexNumber subtract(ComplexNumber c) {
        return new ComplexNumber(real - c.getReal(), imaginary - c.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber c) {
        return new ComplexNumber(real * c.getReal() - imaginary * c.getImaginary(),
                imaginary * c.getReal() + real * c.getImaginary());
    }

    public ComplexNumber getConjugate() {
        return new ComplexNumber(real, -imaginary);
    }

    public ComplexNumber divide(ComplexNumber c) {
        if (c.real == 0 && c.imaginary == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }

        double denominator = c.real * c.real + c.imaginary * c.imaginary;
        double newReal = (real * c.real + imaginary * c.imaginary) / denominator;
        double newImaginary = (imaginary * c.real - real * c.imaginary) / denominator;

        return new ComplexNumber(newReal, newImaginary);
    }

    public static void main(String[] args) {
        // Test your ComplexNumber class here
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(1, 7);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("Addition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
        System.out.println("Multiplication: " + c1.multiply(c2));
        System.out.println("Conjugate of c1: " + c1.getConjugate());

        try {
            System.out.println("Division: " + c1.divide(c2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

package Exem;

public class exem06 {
    private double real;
    private double imaginary;

    public exem06(double real) {
        this(real, 0.0);
    }

    public exem06(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }
}
package Exem;

public class exem01 {
    private double base;
    private double height;

    public exem01(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double findArea() {
        return (base * height) / 2.0;
    }

    public boolean isSameArea(exem01 t) {
        return this.findArea() == t.findArea();
    }
}
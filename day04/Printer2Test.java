package ExemPrinter;

public class Printer2Test {
    public static void main(String[] args) {
        Printer2 p = new Printer2(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
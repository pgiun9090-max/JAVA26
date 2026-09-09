package Exem;

public class exem01Test {
    public static void main(String[] args) {
        exem01 t = new exem01(10.0, 5.0);
        System.out.println(t.findArea());

        System.out.println("--------------------");

        exem01 t1 = new exem01(10.0, 5.0);
        exem01 t2 = new exem01(5.0, 10.0);
        exem01 t3 = new exem01(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
package Exem;

public class exem05Test {
    public static void main(String[] args) {
        exem05 a = new exem05(1);
        exem05 b = new exem05(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
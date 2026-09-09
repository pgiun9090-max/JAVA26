package Exem;

public class exem04Test {
    public static void main(String[] args) {
        exem04 c1 = new exem04("red");
        exem04 c2 = new exem04("blue");
        exem04 c3 = new exem04("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d\n", 
                exem04.getNumOfCar(), exem04.getNumOfRedCar());
    }
}
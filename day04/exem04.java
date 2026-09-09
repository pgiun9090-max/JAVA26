package Exem;

public class exem04 {	
    private String color;
    private static int numOfCar = 0;
    private static int numOfRedCar = 0;

    public exem04(String color) {
        this.color = color;
        numOfCar++;
        
        if (color != null && color.equalsIgnoreCase("red")) {
            numOfRedCar++;
        }
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }
}

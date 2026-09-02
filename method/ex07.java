package method;

import java.util.Scanner;

public class ex07 {
	
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(c, y);
    }
    
    public static String input(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " : ");
        return sc.next();
    }

    public static void whosWin(String c, String y) {
        if (c.equals(y)) {
            System.out.println("무승부!");
        } else if ((c.equals("r") && y.equals("s")) ||
                   (c.equals("s") && y.equals("p")) ||
                   (c.equals("p") && y.equals("r"))) {
            System.out.println("철수, 승!");
        } else {
            System.out.println("영희, 승!");
        }
    }
}

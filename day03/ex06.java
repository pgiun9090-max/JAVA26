package method;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("철수 : ");
        String chulsu = sc.next();
        
        System.out.print("영희 : ");
        String younghee = sc.next();
        
        if (chulsu.equals(younghee)) {
            System.out.println("무승부!");
        } else if ((chulsu.equals("r") && younghee.equals("s")) ||
                   (chulsu.equals("s") && younghee.equals("p")) ||
                   (chulsu.equals("p") && younghee.equals("r"))) {
            System.out.println("철수, 승!");
        } else {
            System.out.println("영희, 승!");
        }
    }
}
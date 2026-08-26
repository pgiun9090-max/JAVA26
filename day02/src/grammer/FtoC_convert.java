package grammer;

import java.util.Scanner;

public class FtoC_convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("화씨온도를 입력하세요 : ");
        double fahrenheit = sc.nextDouble();

        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.println("섭씨온도 : " + celsius);
    }
}
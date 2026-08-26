package grammer;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		
		double width, height, sum;
		java.util.Scanner sc = new Scanner(System.in);
        System.out.print("가로 입력 : ");
        width = sc.nextDouble();
        System.out.print("세로 입력 : ");
        height = sc.nextDouble();
        
        sum = width * height;
        
        System.out.printf("직사각형의 넓이는 %.1fCM 입니다.",sum);
	}
}

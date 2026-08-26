package grammer;

import java.util.Scanner;

public class cylinder {
	public static void main(String[] args) {
		double PI = 3.14;
		double r, result;
		int height;
		
		java.util.Scanner sc = new Scanner(System.in);
        
		System.out.print("반지름 입력 : ");
        r = sc.nextDouble();
        System.out.print("높이 입력 : ");
        height = sc.nextInt();
        
        result = (PI * r * r) * height;
        
        System.out.printf("직사각형의 넓이는 %.1f",result);
	}
}

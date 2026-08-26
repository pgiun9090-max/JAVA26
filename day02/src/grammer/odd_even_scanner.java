package grammer;

import java.util.Scanner;

public class odd_even_scanner {
	public static void main(String[] args) {
		
		
		java.util.Scanner sc = new Scanner(System.in);
		
		int decimal;
		System.out.print("정수를 입력하세요 : ");
		decimal = sc.nextInt();
		
		if(decimal % 2 != 0) {
			System.out.print("홀수");
		}else {
			System.out.print("짝수");
		}
		

	}
}

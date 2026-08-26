package grammer;
import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new Scanner(System.in);
		
		int number, result;
		System.out.print("정수를 입력하세요: ");
		number = sc.nextInt();
		
		result = number * number;
		System.out.printf("%d의 제곱은 %d", number, result);
		
	}
}

package method;

import java.util.Scanner;

public class Gugudan {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		gugudan(num);
		
		for(int i = 2; i <= 9; i++) {
			gugudan(i);
			System.out.println();
		}
	}
	
	public static void gugudan(int num) {
		//입력된 num의 구구단을 출력
		
		System.out.println("[구구단 " + num + " 단]");
		
		for(int i = 1; i <= 9; i++) {
			//System.out.println(num + " x " + i + " = " + num*i);
			System.out.printf("%d x %d = %d\n",num,i,num*i);
		}
	}
}

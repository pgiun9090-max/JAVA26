package grammer;

import java.util.Scanner;

public class devide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        boolean result = (num % 4 == 0) || (num % 5 == 0);

        System.out.println(result);
    }
}

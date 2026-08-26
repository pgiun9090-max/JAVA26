package grammer;

import java.util.Scanner;

public class plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("0에서 999 사이의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        int result = 0;

        if((num >= 0) && (num <= 999)) {
            result += num / 100;
            result += (num % 100) / 10;
            result += (num % 10) ;
            System.out.println("각 자릿수의 합 = " + result);
        }
        else {
            System.out.println("입력 조건이 맞지 않습니다.");
        }
    }
}

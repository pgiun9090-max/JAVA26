package method;

import java.util.Scanner;

public class fac03 {
    // 팩토리얼 계산 메서드
    static int factorial(int x) {
        int r = 1;
        while (x > 0) {
            r *= x;
            x--;
        }
        return r;
    }

    public static void main(String[] args) {
        int result;
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = sc.nextInt();
        
        // factorial() 메서드 호출
        result = factorial(n);
        
        System.out.println(result);
    }
}

package method;

import java.util.Scanner;

public class fac01 {
    public static void main(String[] args) {
        int result;
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = sc.nextInt();
        
        result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        
        System.out.println(result);
    }
}

package method;

import java.util.Scanner;

public class fac02 {
    public static void main(String[] args) {
        int result = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("팩토리얼 값을 구할 정수 : ");
        n = sc.nextInt();
        
        while (true) {
            if (n <= 0) {
                break;
            }
            result *= n;
            n--;
        }
        
        System.out.println(result);
    }
}

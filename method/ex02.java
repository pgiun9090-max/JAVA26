package method;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("등수를 입력하세요: ");
        int rank = sc.nextInt();
        
        switch (rank) {
            case 1:
                System.out.println("아주 잘했습니다");
                break;
            case 2:
            case 3:
                System.out.println("잘했습니다");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("보통입니다");
                break;
            default:
                System.out.println("노력해야겠습니다");
                break;
        }
    }
}
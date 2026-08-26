package grammer;

import java.util.Scanner;

public class convert_upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("소문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);

        char upper = (char)(ch - ('a' - 'A'));

        System.out.println("대문자 : " + upper);
    }
}
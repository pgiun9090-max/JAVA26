package grammer;

import java.util.Scanner;

public class graduate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("전공 이수 학점 : ");
        int major = sc.nextInt();

        System.out.print("교양 이수 학점 : ");
        int liberal = sc.nextInt();

        System.out.print("일반 이수 학점 : ");
        int general = sc.nextInt();

        int total = major + liberal + general;

        if (major >= 70 && 
            (liberal >= 30 && general >= 30 || liberal + general >= 80) &&
            total >= 140) {
            
            System.out.println("졸업 가능");
        } else {
            System.out.println("졸업 불가능");
        }
    }
}

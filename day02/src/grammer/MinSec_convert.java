package grammer;
import java.util.Scanner;


public class MinSec_convert {
	public static void main(String[] args) {
		
		int tot_seconds, hour, minute, seconds;
		java.util.Scanner sc = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요: ");
		tot_seconds = sc.nextInt();
		
		hour = tot_seconds / 3600;
		minute = (tot_seconds % 3600) / 60;
		seconds = tot_seconds % 60;
		System.out.printf("%d시간 %d분 %d초",hour, minute, seconds);
		
	}
}

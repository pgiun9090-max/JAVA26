package method;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 4, 8, 10, 30};
		
		System.out.println("getSum의 결과값 = " + getSum(numArr));
		System.out.println("getMax의 결과값 = " + getMax(numArr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int target = sc.nextInt();
		System.out.println("getCount의 결과값 = " + getCount(numArr,target));
	}
	
	public static int getSum(int[] numArr) {
		if(numArr == null) return -1;
		int sum = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		return sum;
	}

	public static int getMax(int[] numArr) {
		int max = 0;
		for(int i = 0; i < numArr.length; i++) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static int getCount(int[] numArr, int target) {
		int count = 0;
        for (int num : numArr) {
            if (num > target) {
                count++;
            }
        }
        return count;
    }
}

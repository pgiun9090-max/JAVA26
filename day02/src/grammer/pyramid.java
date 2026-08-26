package grammer;

public class pyramid {
	public static void main(String[] args) {
		int h = 5;
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= h -i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 *i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

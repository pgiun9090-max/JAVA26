package bank.app.console;

import java.util.Scanner;

final public class ScannerInput {
	private static final Scanner scanner = new Scanner(System.in);
	
	public String readString(String message) {
		System.out.print(message);
		return scanner.nextLine();
	}
	
	public int readInt(String message) {
		System.out.print(message);
		String inStr = scanner.nextLine();
		return Integer.parseInt(inStr);
	}
	
	public boolean readYesNo(String message) {
		while(true) {
			System.out.print(message + "(y/n)");
			String in = scanner.nextLine().trim();
			switch (in.toLowerCase()) {
			case "y", "yes" -> { return true; }
			case "n", "no" -> { return false; }
			default -> System.out.print("y 또는 n을 입력하시오");
			}
		}
		
	}
}

package ovningar;

public class ovning22 {
	public static void main (String[] args) {
		java.util.Scanner in =
				new java.util.Scanner(System.in);
		String input;
		do {
			System.out.println("Write ’exit’ to exit.");
			input = in.next();
		} while (!input.equals("exit"));
		System.out.println("Thank you, now I can rest.");
	}
}

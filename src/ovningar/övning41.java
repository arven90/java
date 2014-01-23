package ovningar;

public class övning41 {

	public static void main (String[] args)
			throws Exception {
		System.out.print("a charcter: ");
		char c = (char) System.in.read();
		System.out.print("another character: ");
		int code = System.in.read();
		System.out.println("The first character: "
				+ c);
		System.out.println("The Unicode-code for the " +
				"second character: " + code);
	}
}

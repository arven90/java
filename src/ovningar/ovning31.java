package ovningar;

public class ovning31 {
	public static void main(String[] args) {
		int a = 1;
		// Here we use an assignment to save
		// the returned value in a variable:
		int b = addOne(a);
		int c = addOne(3);
		addOne(b);
		System.out.println(a);// skriver endast ut inten a
		System.out.println(b);//skriver ut a,som är ett, plus addonemetodens +1
		System.out.println(c);//skriver ut c som ger ut 3 + addones +1 = 4
	}

	public static int addOne(int prior) {
		return prior + 1;
	}

}

package ovningar;

public class ovning24 {
	public static void main (String[] args) {
		int m = 0;
		while (m > 0) {
			System.out.print(m + " ");
		}
		System.out.println();
		do {
			System.out.print(m + " ");
		}
		while (m > 0);
		System.out.println();
		for ( ; m > 0 ; ) {
			System.out.print (m + " ");
		}
		System.out.println();
	}
}


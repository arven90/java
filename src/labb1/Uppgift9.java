package labb1;

public class Uppgift9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char bokstav= 'a';
		switch (bokstav) {
		case 'A':			
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'Y':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':	
			System.out.println("Vokal.");
			break;
//We have done cases for each vowel because they are in minority. Consonant is default.
		default:
			System.out.println("Konsonant");

		}
	}

}

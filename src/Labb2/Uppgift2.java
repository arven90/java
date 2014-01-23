package Labb2;

public class Uppgift2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 	{
		// TODO Auto-generated method stub
		int i = 1;

		while (i <=10) {//while loopen ser till att for loopen upprepas 10 gånger.

			for (char alfabet = 'A'; alfabet != '['; alfabet ++){
				System.out.print(alfabet);
				/* For loopen skriver ut alfabetet.
[ tecknet kommer direkt efter Z i unicode chartern.*/
			}

			i++;

			System.out.println();
// ger varje alfabet en ny rad så det blir lite snyggare
		}
	}

}

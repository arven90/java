package Labb2;

public class Uppgift3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] b1 = new char[3];
		b1[0]='a';
		b1[1]='b';
		b1[2]='c';
		System.out.println(b1); //skriver ut  en oförändrad array 
		char[]b2={'d'};
		char[]b3={'e'};
		char letter = b2[0];
		b1[0]=letter; // b1s första plats ändras till tecknet d.
		char letter2 =b3[0];
		b1[1]=letter2;// b1s andra plats ändras till tecknet e.

	System.out.println(b2[0]+""+b1[1]+""+b1[2]); //skriver ut arrayens element på ett sätt
	
	System.out.println(b1); // skriver ut arrayens element ett annat sätt
	
	System.out.println(b1[0] + "" + b3[0] + "" + b1[2]);// skriver ut arrayens element på ett tredje sätt
	
		
	}

}

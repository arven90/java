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
		System.out.println(b1); //skriver ut  en of�r�ndrad array 
		char[]b2={'d'};
		char[]b3={'e'};
		char letter = b2[0];
		b1[0]=letter; // b1s f�rsta plats �ndras till tecknet d.
		char letter2 =b3[0];
		b1[1]=letter2;// b1s andra plats �ndras till tecknet e.

	System.out.println(b2[0]+""+b1[1]+""+b1[2]); //skriver ut arrayens element p� ett s�tt
	
	System.out.println(b1); // skriver ut arrayens element ett annat s�tt
	
	System.out.println(b1[0] + "" + b3[0] + "" + b1[2]);// skriver ut arrayens element p� ett tredje s�tt
	
		
	}

}

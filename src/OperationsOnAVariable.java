
public class OperationsOnAVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 6;
		int c = 10;
		int d = 12;
		
		b= b + a;
		//b f�r v�rdet 10
		c -= b;
		//c f�r v�rdet 4
		d /= a;
		a = a * 10;
		//a f�r v�rdet
		a %= 7;
		System.out.println(a+" "+b+" "+c+" "+d);
				
	}

}

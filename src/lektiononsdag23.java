
public class lektiononsdag23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte aByte = 127;
		byte anotherbyte = 126;
		System.out.println(aByte);
		System.out.println(aByte + anotherbyte);

		System.out.println(aByte + anotherbyte);
		byte athirdbyte = (byte)(aByte+anotherbyte);
		System.out.println((byte)(aByte + anotherbyte));
		System.out.println(athirdbyte);
		System.out.println((byte)(aByte+anotherbyte));
		//logic
		boolean b1 =false;
		boolean b2 =false;
		boolean b3 =false;

		if((b1&&b2) || (b1&&b3)) {
			System.out.println("Hey!");
		}else 
			System.out.println("Woops!");
	}











}



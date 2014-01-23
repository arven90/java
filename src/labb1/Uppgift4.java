package labb1;

public class Uppgift4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 10;
		int i1 = b1;
		int i2 = 10;
		byte b2 = (byte)i2;// i2 is an int. It needs to be casted to become a byte.
		System.out.println(i1);
		System.out.println(b2);
		float f1 = 2.5F;
		double d1 = f1;
		double d2 = 2.5;
		float f2 = (float)d2;//d2 is a double and needs to be casted to become a float.
		float f3 = (float)2.5;//double is default for floating point numbers in java. so we have to force it into a float. 
		System.out.println(d1);
		System.out.println(f2);
// f3 is not used. When we asked a labb assistent if we should delete it, he said to let it be.

	}

}
